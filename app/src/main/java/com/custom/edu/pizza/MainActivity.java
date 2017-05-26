package com.custom.edu.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] dominos;
    String[] address;
    int[] imgdominos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.main_list);
        dominos=getResources().getStringArray(R.array.dominos);
        address=getResources().getStringArray(R.array.address);
        imgdominos=new int[]{R.drawable.dominos_logo};
        CustomList customList = new CustomList(this,R.layout.single_row,dominos,address,imgdominos);
        list.setAdapter(customList);

    }
}

