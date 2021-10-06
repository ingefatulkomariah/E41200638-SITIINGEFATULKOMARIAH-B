package com.inge.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button buttonLogin;

    @Override
    /**Mencari id **/

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        buttonLogin = findViewById(R.id.btnLogin);
       buttonLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           /**Membuat inten pindah */
           public void onClick(View v) {
               Intent pindah = new Intent(login.this, Menu.class);
               startActivity(pindah);
           }
       });
    }
    }