package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView ProgrammingList=findViewById(R.id.recyclerView);
        ProgrammingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"C","C++","Java","Python","Cobol","Pascal","JavaScript","Python","Hack"};
        ProgrammingList.setAdapter(new MyAdapter(languages));
        


    }
}