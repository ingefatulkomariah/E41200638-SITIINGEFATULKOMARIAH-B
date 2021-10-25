package com.example.manajemen_file

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var editText: EditText? = null
    private val STORAGE_PERMISSION_CODE = 23
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById<View>(R.id.editText2) as EditText
    }

    fun next(view: View?) {
        val intent = Intent(this@MainActivity, activity_main2::class.java)
        startActivity(intent)
    }

    fun savePublic(view: View?) {
        //permission to access external storage
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
            STORAGE_PERMISSION_CODE
        )
        val info = editText!!.text.toString()
        val folder =
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) //Folder Name
        val myFile = File(folder, "myData1.txt") //Filename
        writeData(myFile, info)
        editText!!.setText("")
    }

    fun savePrivate(view: View?) {
        val info = editText!!.text.toString()
        val folder = getExternalFilesDir("Tanti") //Folder Name
        val myFile = File(folder, "myData2.txt") //Filename
        writeData(myFile, info)
        editText!!.setText("")
    }

    private fun writeData(myFile: File, data: String) {
        var fileOutputStream: FileOutputStream? = null
        try {
            println("TES")
            fileOutputStream = FileOutputStream(myFile)
            fileOutputStream.write(data.toByteArray())
            Toast.makeText(this, "Done" + myFile.absolutePath, Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
    }
}