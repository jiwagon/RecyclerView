package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

public class StudentListActivity extends AppCompatActivity {

    private final StudentData[] STUDENT_LIST = {
            new StudentData("John Doe", R.drawable.boy1, "jmd1234@psu.edu", "614-881-7600", "entrepreneurship, pitch competition"),
            new StudentData("Jane Doe", R.drawable.girl1, "jnd4353@psu.edu", "614-789-3412", "machine learning, software development")
    };
}
