package com.muphred.org.seller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerMain extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_recycler_main);

        RecyclerView programmingList=findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<DataModel> arrayList=new ArrayList<>();
        arrayList.add(new DataModel(1,"Java"));
        arrayList.add(new DataModel(2,"C"));
        arrayList.add(new DataModel(3,"C++"));



        TestRecyclerAdapter testRecyclerAdapter=new TestRecyclerAdapter(TestRecyclerMain.this, arrayList);


        programmingList.setAdapter(testRecyclerAdapter);
    }
}
