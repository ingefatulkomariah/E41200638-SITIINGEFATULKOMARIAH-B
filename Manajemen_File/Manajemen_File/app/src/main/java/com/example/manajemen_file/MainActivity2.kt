package com.example.manajemen_file

import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.lang.Exception

class activity_main2 : AppCompatActivity() {
    var showText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showText = findViewById<View>(R.id.getText) as TextView
    }

    fun back(view: View?) {
        val intent = Intent(this@activity_main2, MainActivity::class.java)
        startActivity(intent)
    }

    fun getPublic(view: View?) {
        val folder =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) //Folder Name
        val myFile = File(folder, "myData1.txt") //Filename
        val text = getdata(myFile)
        if (text != null) {
            showText!!.text = text
        } else {
            showText!!.text = "No Data"
        }
    }

    fun getPrivate(view: View?) {
        val folder = getExternalFilesDir("Tanti") //Folder Name
        val myFile = File(folder, "myData2.txt") //Filename
        val text = getdata(myFile)
        if (text != null) {
            showText!!.text = text
        } else {
            showText!!.text = "No Data"
        }
    }

    private fun getdata(myFile: File): String? {
        var fileInputStream: FileInputStream? = null
        try {
            fileInputStream = FileInputStream(myFile)
            var i = -1
            val buffer = StringBuffer()
            while (fileInputStream.read().also { i = it } != -1) {
                buffer.append(i.toChar())
            }
            return buffer.toString()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
        return null
    }
}