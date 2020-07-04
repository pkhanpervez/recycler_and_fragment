package com.muphred.org.seller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class TestRecyclerMain extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_recycler_main);

        RecyclerView programmingList=findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] tutorial={"T-Shirt","Shoe","Mobile","PC","Laptop","Fan","AC","T-Shirt","Shoe","Mobile","PC","Laptop","Fan","AC"};
        programmingList.setAdapter(new TestRecyclerAdapter(tutorial));
    }
}
