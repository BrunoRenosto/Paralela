package com.example.paralela;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void teste(View view) {
        Toast toast = Toast.makeText(this,"Feliz Aniversário",Toast.LENGTH_SHORT);
        toast.show();
    }







}

