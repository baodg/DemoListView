package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodAdapter adt;
    ArrayList<Gooods> arrayList;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods =findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Gooods("Áo google","60$",R.drawable.aogoogle));
        arrayList.add(new Gooods("Áo thun xám","40$",R.drawable.aoxam));

        adt = new CustomGoodAdapter(this,R.layout.viewlist_item,arrayList);
        lvGoods.setAdapter(adt);
    }
}
