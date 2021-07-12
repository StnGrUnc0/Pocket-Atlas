package com.example.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ConstellationAdapter extends ArrayAdapter<Group>
{

    public ConstellationAdapter(Context context, int resource, List<Group> groupList)
    {
        super(context,resource,groupList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Group group = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_const_cell, parent, false);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.groupName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.groupImage);

        //tv.setText(group.getFamilyGroupCode() + " - " + group.getName());
        tv.setText(group.getName());
        iv.setImageResource(group.getImage());


        return convertView;
    }
}
