package com.inge.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    //deklarasi bottom
    BottomNavigationView botomnavi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botomnavi = findViewById(R.id.navi);
        //mendefault kan fragment ketika baru dibuka
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmen, new ChatFragment()).commit();
        botomnavi.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {



                //memanggil fragment yang sudah dibuat
                Fragment setelectedFragment = null;
                switch (item.getItemId()){
                    case R.id.chat:
                        setelectedFragment = new ChatFragment();
                        break;
                    case  R.id.status:
                        setelectedFragment = new StatusFragment();
                        break;
                    case R.id.calls:
                        setelectedFragment = new CallsFragment();
                        break;
                }

                //fungsi mengubah setiap fragment

                getSupportFragmentManager().beginTransaction().replace(R.id.fragmen, setelectedFragment).commit();

                return true;
            }
        });

    }

}