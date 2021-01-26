package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.branchAdapter.Branch;
import com.example.myapplication.branchAdapter.branchAdapter;

import java.util.ArrayList;

public class BranchActivity extends AppCompatActivity {

    ArrayList<Branch> branchActivityArrayList = new ArrayList<Branch>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        setInitialData();
        branchAdapter adapter=new branchAdapter(this, branchActivityArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        branchActivityArrayList.add(new Branch("Москва, ул. Вавилова, д. 7","Банкомат","Работает", "часы работы"));
        branchActivityArrayList.add(new Branch("Москва, ул. Вавилова, д. 52","Отделение","Работает", "часы работы"));
        branchActivityArrayList.add(new Branch("Москва, ул. Ленина, д. 4","Банкомат","Работает", "часы работы"));
        branchActivityArrayList.add(new Branch("Москва, ул. Ленина, д. 4","Отделение","Не работает", "часы работы"));
    }
}