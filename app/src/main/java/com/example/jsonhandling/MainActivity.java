package com.example.jsonhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson=new Gson();
        Student student=new Student("Shafah",4,"sh@gmail.com");

        String json=gson.toJson(student);

        Log.d("test",json);
    }
}
