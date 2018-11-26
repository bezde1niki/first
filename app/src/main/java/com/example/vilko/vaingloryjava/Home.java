package com.example.vilko.vaingloryjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.red);
        setContentView(R.layout.activity_home);
    }

    public void clik_new(View view) {
        Toast.makeText(this, "Марина, пойдем гулять?", Toast.LENGTH_LONG).show();
    }

}
