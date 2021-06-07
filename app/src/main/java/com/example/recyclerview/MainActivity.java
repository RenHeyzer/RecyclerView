package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        List<String> list = new ArrayList<>();
        list.add("Врата 1");
        list.add("Врата 2");
        list.add("Врата 3");
        list.add("Врата 4");
        list.add("Врата 5");
        list.add("Врата 6");

        List<String> list1 = new ArrayList<>();
        list1.add("Свет 1");
        list1.add("Свет 2");
        list1.add("Свет 3");
        list1.add("Свет 4");
        list1.add("Свет 5");
        list1.add("Свет 6");

        List<Integer> list2 = new ArrayList<>();
        list2.add(R.drawable.one);
        list2.add(R.drawable.two);
        list2.add(R.drawable.three);
        list2.add(R.drawable.four);
        list2.add(R.drawable.i);
        list2.add(R.drawable.images);


        adapter = new RecyclerAdapter(list,list1, list2, this);
        rvList.setAdapter(adapter);
    }
}