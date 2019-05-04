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

        Course course=new Course("Java","Bootcamp");

        Student student=new Student("shafah",3,"abc@gmail.com",course);

        String json=gson.toJson(student);

        Log.d("TEST",json);


    }
}
