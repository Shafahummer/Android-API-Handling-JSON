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

//        Course course=new Course("Java","Bootcamp");
//
//        Student student=new Student("shafah",3,"abc@gmail.com",course);
//
//        String json=gson.toJson(student);

        String json="{\"courseCount\":3,\"email\":\"abc@gmail.com\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"name\":\"shafah\"}";
        Student student=gson.fromJson(json,Student.class);

        Log.d("TEST",student.toString());


    }
}
