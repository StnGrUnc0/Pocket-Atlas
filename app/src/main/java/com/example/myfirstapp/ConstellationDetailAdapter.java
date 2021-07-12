package com.example.myfirstapp;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TableRow;
import android.widget.TextView;


import java.util.List;

public class ConstellationDetailAdapter extends ArrayAdapter<Object>
{
    public ConstellationDetailAdapter(Context context, int resource, List<Object> objectList)
    {
        super(context, resource, objectList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Object object = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_const_detail_cell, parent, false);
        }
        TextView data1 = (TextView) convertView.findViewById(R.id.data1);
        TextView data2 = (TextView) convertView.findViewById(R.id.data2);
        TextView data3 = (TextView) convertView.findViewById(R.id.data3);
        TextView data4 = (TextView) convertView.findViewById(R.id.data4);
        TextView data5 = (TextView) convertView.findViewById(R.id.data5);

        data1.setText(object.getObjectId());
        data2.setText(object.getObjectName());
        data3.setText(object.getObjectNameM());
        data4.setText(object.getObjectType());
        data5.setText(object.getObjectMagn());

        return convertView;
    }
}
