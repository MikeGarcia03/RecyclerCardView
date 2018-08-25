package com.example.mg2013_0864.recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MarcaPais> list = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add(new MarcaPais("Honda","JAPON"));
        list.add(new MarcaPais("Toyota","JAPON"));
        list.add(new MarcaPais("Nissan","JAPON"));
        list.add(new MarcaPais("Ford","ESTADOS UNIDOS"));
        list.add(new MarcaPais("Chevrolet","Estados Unidos"));
        list.add(new MarcaPais("Kia","COREA DEL SUR"));
        list.add(new MarcaPais("Hyundai","COREA DEL SUR"));
        list.add(new MarcaPais("Ferrari","ITALIA"));
        list.add(new MarcaPais("Maserati","ITALIA"));

        RecyclerView rv = findViewById(R.id.myRecycleView);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(new MyRecyclerCardAdapter(this, list));
    }
}
