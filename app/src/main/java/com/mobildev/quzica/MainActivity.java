package com.mobildev.quzica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    CustomAdapter customAdapter;
    LinearLayout header;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        header = findViewById(R.id.header);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        customAdapter = new CustomAdapter(MainActivity.this, getListOfData());
        recyclerView.setAdapter(customAdapter);
        recyclerView.setNestedScrollingEnabled(false);

    }


    private ArrayList<QuestionModel> getListOfData() {
        ArrayList<QuestionModel> listofData = new ArrayList<>();
        listofData.add(new QuestionModel(getString(R.string.q1),14,65,2));
        listofData.add(new QuestionModel(getString(R.string.q2),67,90,12));
        listofData.add(new QuestionModel(getString(R.string.q3),12,34,3));
        listofData.add(new QuestionModel(getString(R.string.q4),68,98,12));
        listofData.add(new QuestionModel(getString(R.string.q5),40,56,8));
        listofData.add(new QuestionModel(getString(R.string.q6),86,101,30));
        listofData.add(new QuestionModel(getString(R.string.q7),45,89,7));
        listofData.add(new QuestionModel(getString(R.string.q8),62,78,17));
        listofData.add(new QuestionModel(getString(R.string.q9),91,123,34));

        return listofData;
    }
}
