package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.kursAdapter.Kurs;
import com.example.myapplication.kursAdapter.KursAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class KursActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    KursAdapter kursAdapter;
    ArrayList<Kurs> kursArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs);
        TextView TextDate=findViewById(R.id.KursData);
        SimpleDateFormat format= new SimpleDateFormat("dd.MM.yyyy");
        TextDate.setText(format.format(new Date()));

        recyclerView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        kursArrayList.add(new Kurs("fwfw"));kursArrayList.add(new Kurs("fwfw234"));kursArrayList.add(new Kurs("fwfffw"));

        kursAdapter = new KursAdapter(this, kursArrayList);
        recyclerView.setAdapter(kursAdapter);
    }
}