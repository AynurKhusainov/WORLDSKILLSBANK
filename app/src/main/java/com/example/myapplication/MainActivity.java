package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textDate=findViewById(R.id.TDate);
        SimpleDateFormat format= new SimpleDateFormat("dd.MM.yyyy");
        textDate.setText(format.format(new Date()));
    }

    public void enter(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.Theme_AppCompat_Dialog_Alert);
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.registation_form, null);

        final TextView textView = v.findViewById(R.id.cancel);
        builder.setView(v).setCancelable(true);
        final AlertDialog alertDialog = builder.create();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

    public void enterBranch(View view) {
        Intent i = new Intent(MainActivity.this,BranchActivity.class);
        startActivity(i);
    }

    public void enterKurs(View view) {
        Intent s = new Intent(MainActivity.this,KursActivity.class);
        startActivity(s);
    }
}