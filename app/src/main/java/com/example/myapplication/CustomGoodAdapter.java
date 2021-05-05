package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.CharArrayWriter;
import java.util.ArrayList;

public class CustomGoodAdapter extends BaseAdapter {

    Context ctx;
    int layoutitem;
    ArrayList<Gooods> arrayList;

    public CustomGoodAdapter(Context ctx, int layoutitem, ArrayList<Gooods> arrayList) {
        this.ctx = ctx;
        this.layoutitem = layoutitem;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {

        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        boolean attachToRoot;
        view = LayoutInflater.from(ctx).inflate(layoutitem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.textView);
        TextView tvPrice = view.findViewById(R.id.textView2);
        ImageView imgGoods = view.findViewById(R.id.imageView2);
        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }
}
