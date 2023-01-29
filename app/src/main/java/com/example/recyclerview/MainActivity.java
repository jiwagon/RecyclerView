package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private StudentListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private final StudentData[] STUDENT_LIST = {
            new StudentData("Olivia Ouyang", R.drawable.girl1, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Jane Doe", R.drawable.girl2, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Isaac Yap", R.drawable.boy1, "jmd1234@psu.edu", "614-881-7600",
                    "entrepreneurship, pitch competition"),
            new StudentData("Carter Miller", R.drawable.boy2, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("John Doe", R.drawable.boy3, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Isabella Fernandes", R.drawable.girl3, "imf4587@psu.edu", "814-079-7305",
                    "machine learning, software development"),
            new StudentData("Varalika Ananth", R.drawable.girl4, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Anthony Tata", R.drawable.boy4, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Adam Sipe", R.drawable.boy5, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Gabriella Baker", R.drawable.girl5, "gnb4512@psu.edu", "514-102-4367",
                    "machine learning, software development"),
            new StudentData("Amanda Garcia", R.drawable.girl6, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
            new StudentData("Dorcas Adhiambo", R.drawable.girl7, "jnd4353@psu.edu", "614-789-3412",
                    "machine learning, software development"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        mRecyclerView = findViewById(R.id.recycler_view_student);
        mAdapter = new StudentListAdapter(this, STUDENT_LIST);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}