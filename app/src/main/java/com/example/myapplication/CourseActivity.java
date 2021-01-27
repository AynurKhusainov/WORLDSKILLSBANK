package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.CourseAdapter.Course;
import com.example.myapplication.CourseAdapter.CourseAdapter;

import java.util.ArrayList;

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
        recyclerView = findViewById(R.id.courseRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        setInitialData();

        CourseAdapter courseAdapter = new CourseAdapter(CourseActivity.this, arrayList);
        recyclerView.setAdapter(courseAdapter);
    }
    private void setInitialData() {
        arrayList.add(new Course("Москва, ул. Вавилова, д. 7", "Банкомат", "Работает", "часы работы"));
        arrayList.add(new Course("Москва, ул. Вавилова, д. 52", "Отделение", "Работает", "часы работы"));
        arrayList.add(new Course("Москва, ул. Ленина, д. 4", "Банкомат", "Работает", "часы работы"));
        arrayList.add(new Course("Москва, ул. Ленина, д. 4", "Отделение", "Не работает", "часы работы"));
    }

}