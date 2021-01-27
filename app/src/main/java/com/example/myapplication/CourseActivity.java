package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.CourseAdapter.Course;
import com.example.myapplication.CourseAdapter.CourseAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CourseActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Course> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        init();
    }

    public void init() {
        TextView textDate= findViewById(R.id.data_text);
        SimpleDateFormat format= new SimpleDateFormat("dd.MM.yyyy");
        textDate.setText(format.format(new Date()));

        recyclerView = findViewById(R.id.courseRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        setInitialData();

        CourseAdapter courseAdapter = new CourseAdapter(CourseActivity.this, arrayList);
        recyclerView.setAdapter(courseAdapter);
    }
    private void setInitialData() {
        arrayList.add(new Course("USD", "Американский доллар", "64,95", "64,95"));
        arrayList.add(new Course("USD", "Американский доллар", "64,95", "64,95"));
        arrayList.add(new Course("USD", "Американский доллар", "64,95", "64,95"));
        arrayList.add(new Course("USD", "Американский доллар", "64,95", "64,95"));
        arrayList.add(new Course("USD", "Американский доллар", "64,95", "64,95"));
    }

}