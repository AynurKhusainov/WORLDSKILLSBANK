package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.BranchAdapter.Branch;
import com.example.myapplication.BranchAdapter.BranchAdapter;

import java.util.ArrayList;

public class BranchActivity extends AppCompatActivity {
    ArrayList<Branch> branchActivityArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        setInitialData();

        BranchAdapter adapter = new BranchAdapter(BranchActivity.this, branchActivityArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        branchActivityArrayList.add(new Branch("Москва, ул. Вавилова, д. 7", "Банкомат", "Работает", "часы работы"));
        branchActivityArrayList.add(new Branch("Москва, ул. Вавилова, д. 7", "Банкомат", "Работает", "часы работы"));
        branchActivityArrayList.add(new Branch("Москва, ул. Вавилова, д. 7", "Банкомат", "Работает", "часы работы"));
        branchActivityArrayList.add(new Branch("Москва, ул. Вавилова, д. 7", "Банкомат", "Работает", "часы работы"));
    }
}