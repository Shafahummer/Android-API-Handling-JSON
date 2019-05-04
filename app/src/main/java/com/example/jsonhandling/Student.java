package com.example.jsonhandling;

import com.google.gson.annotations.SerializedName;

public class Student {

    private String name;
    @SerializedName("courseCount")
    private int course_count;
    private String email;

    @SerializedName("course")
    private Course mCourse;

    public Student(String name, int courseCount, String email,Course course) {
        this.name = name;
        this.course_count = courseCount;
        this.email = email;
        mCourse=course;
    }
}
