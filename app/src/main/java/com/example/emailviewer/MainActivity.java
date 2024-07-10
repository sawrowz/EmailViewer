package com.example.emailviewer;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<EmailItem> emailList = new ArrayList<EmailItem>();

        emailList.add(new EmailItem("A", "Saroj", "Hello"));
        emailList.add(new EmailItem("B", "Ram", "hi"));
        emailList.add(new EmailItem("C", "Hari", "hi there"));
        emailList.add(new EmailItem("D", "Sita", "hlw"));
        emailList.add(new EmailItem("E", "Anjali", "abc"));
        emailList.add(new EmailItem("F", "Shyam", "xyz"));

        MailAdapter mailAdapter = new MailAdapter(emailList);
        recyclerView.setAdapter(mailAdapter);

    }
}