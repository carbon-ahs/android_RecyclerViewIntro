package com.example.recyclerviewintro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewintro.data.Item;
import com.example.recyclerviewintro.data.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Ahsan Habib", "01755215173"));
        items.add(new Item("Aa", "0"));
        items.add(new Item("Ab", "0"));
        items.add(new Item("Ac", "0"));
        items.add(new Item("Ad", "0"));
        items.add(new Item("Ae", "0"));
        items.add(new Item("Af", "0"));
        items.add(new Item("Ag", "0"));
        items.add(new Item("Ah", "0"));
        items.add(new Item("Ai", "0"));
        items.add(new Item("Aj", "0"));
        items.add(new Item("Ak", "0"));
        items.add(new Item("Al", "0"));
        items.add(new Item("Am", "0"));



        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

    }
}