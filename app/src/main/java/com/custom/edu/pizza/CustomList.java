package com.custom.edu.pizza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VNurtureTechnologies on 21-05-2017.
 */


public class CustomList extends ArrayAdapter<String> {

    String[] dominos;
    String[] address;
    int res;
    Context context;
    TextView textViewdominos;
    TextView textViewaddress;

    public CustomList(Context context, int resource,String[] dominos, String[] address) {
        super(context, resource,dominos);
        this.context=context;
        this.dominos=dominos;
        this.address=address;


    }

    /*public CustomList(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CustomList(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    public CustomList(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CustomList(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    public CustomList(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }*/
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(res,parent,false);
        textViewdominos=(TextView) convertView.findViewById(R.id.single_row_textheader);
        textViewaddress=(TextView) convertView.findViewById(R.id.single_row_textaddress);
        return convertView;
    }
}
