package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private StudentListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private StudentData[] mStudentList;

    private final StudentData[] STUDENT_LIST = {
            new StudentData("Olivia Ouyang", R.drawable.girl1, "ono6964@psu.edu", "214-789-8417",
                    "machine learning, software development"),
            new StudentData("Jane Doe", R.drawable.girl2, "jnd4353@psu.edu", "614-789-3412",
                    "project management, team organization"),
            new StudentData("Isaac Yap", R.drawable.boy1, "imy1234@psu.edu", "814-881-7600",
                    "data science, software development, machine learning"),
            new StudentData("Carter Miller", R.drawable.boy2, "cnm7812@psu.edu", "714-739-2202",
                    "relationship management, design systems, design thinking"),
            new StudentData("John Doe", R.drawable.boy3, "jkd6631@psu.edu", "720-353-6382",
                    "finTech, blockchain, machine learning"),
            new StudentData("Isabella Fernandes", R.drawable.girl3, "imf4587@psu.edu", "814-079-7305",
                    "mental health, healthcare tech"),
            new StudentData("Varalika Ananth", R.drawable.girl4, "vna9089@psu.edu", "614-435-3662",
                    "edTech, social impact, UX research"),
            new StudentData("Anthony Tata", R.drawable.boy4, "att4262@psu.edu", "614-501-4349",
                    "bioinformatics, data analysis"),
            new StudentData("Adam Sipe", R.drawable.boy5, "ags1030@psu.edu", "814-712-8912",
                    "strategic communication, public speaking, teamwork"),
            new StudentData("Gabriella Baker", R.drawable.girl5, "gnb4512@psu.edu", "514-102-4367",
                    "community, social impact venture, pitch competition"),
            new StudentData("Amanda Garcia", R.drawable.girl6, "alg3573@psu.edu", "814-423-4501",
                    "product development, Nittany AI Challenge"),
            new StudentData("Dorcas Adhiambo", R.drawable.girl7, "dma7812@psu.edu", "624-129-9012",
                    "Hackathon, cybersecurity, IdeaMaker Challenge"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        mRecyclerView = findViewById(R.id.recycler_view_student);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new StudentListAdapter(this, STUDENT_LIST);
        mRecyclerView.setAdapter(mAdapter);
    }

    /**
     * url: https://developer.android.com/develop/ui/views/search/training/setup#java
     * To display the SearchView in the app bar,
     * inflate the XML menu resource (res/menu/options_menu.xml)
     * in the onCreateOptionsMenu() method of your activity:
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }
}