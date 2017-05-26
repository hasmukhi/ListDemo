package com.custom.edu.pizza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VNurtureTechnologies on 21-05-2017.
 */


public class CustomList extends BaseAdapter  {

    String[] dominos;
    String[] address;
    int res;
    int[] imgdominos;
    Context context;
    TextView textViewdominos;
    TextView textViewaddress;
    ImageView imgViewdominos;

    public CustomList(Context context,int res, String[] dominos, String[] address,int[] imgdominos) {
        this.context=context;
        this.res=res;
        this.dominos=dominos;
        this.address=address;
        this.imgdominos=imgdominos;
    }


    @Override
    public int getCount() {
        return dominos.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(res,parent,false);
        textViewdominos=(TextView) convertView.findViewById(R.id.single_row_textheader);
        textViewaddress=(TextView) convertView.findViewById(R.id.single_row_textaddress);
        imgViewdominos=(ImageView) convertView.findViewById(R.id.single_row_imageview);
        textViewdominos.setText(dominos[i]);
        textViewaddress.setText(address[i]);
        imgViewdominos.setImageResource(imgdominos[0]);
        return convertView;
    }
}
