package com.cal.sched;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tim on 2/12/14.
 */
public class myAdapter extends BaseAdapter
{
    Context context;
    String[] classes;
    String[] teachers;
    private static LayoutInflater inflater = null;

    public myAdapter(Context context, String[] classes, String[] teachers)
    {
        this.context = context;
        this.classes = classes;
        this.teachers = teachers;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return classes.length + teachers.length;
    }

    @Override
    public Object getItem(int i) { return classes[i] + " " + teachers[i]; }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup)
    {
        View myView = convertView;
        if(myView == null)
            myView = inflater.inflate(R.layout.lin_class, null);
        TextView classer = (TextView) myView.findViewById(R.id.aclass);
        TextView teacher = (TextView) myView.findViewById(R.id.ateacher);
        classer.setText(classes[i]);
        teacher.setText(teachers[i]);

        return myView;
    }
}