package com.example.gridview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gridview.R;
import com.example.gridview.model.GridArrayList;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<GridArrayList> arrayList;

    public GridAdapter(Context context, ArrayList<GridArrayList> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.custom_grid_view, null);
        }

        ImageView grid_img = view.findViewById(R.id.grid_img_view);
        TextView grid_title = view.findViewById(R.id.tv_grid_title);

        grid_img.setImageResource(arrayList.get(i).getGrid_img());
        grid_title.setText(arrayList.get(i).getImg_title());

        return view;
    }
}
