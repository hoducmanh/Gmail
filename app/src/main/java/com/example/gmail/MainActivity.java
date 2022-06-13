package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        DataModel[] myListData = new DataModel[]{
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
                new DataModel("Hồ Đức Mạnh", R.drawable.img),
        };
        MyAdapter adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}