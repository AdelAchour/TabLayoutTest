package com.production.achour_ar.tablayouttest;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;


public class Adapter extends ArrayAdapter<Model> implements View.OnClickListener{

    private ArrayList<Model> dataSet;
    Context mContext;


    // View lookup cache
    private class ViewHolder {
        TextView txtNom;
        TextView txtPrenom;
        TextView txtAge;
    }
    
    
    public Adapter(ArrayList<Model> data, Context context) {
        super(context, R.layout.row_item, data);
        this.dataSet = data;
        this.mContext=context;
        //startUpdateTimer();
    }


    @Override
    public void onClick(View v) {
        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Model Model=(Model)object;

        switch (v.getId())
        {
            case R.id.AgeTV:

                Snackbar.make(v, "Age : " +Model.getAge(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
                break;
        }
    }

    private int lastPosition = -1;


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Model model = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        final ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item, parent, false);
            viewHolder.txtNom = (TextView) convertView.findViewById(R.id.NomTV);
            viewHolder.txtPrenom = (TextView) convertView.findViewById(R.id.PrenomTV);
            viewHolder.txtAge = (TextView) convertView.findViewById(R.id.AgeTV);


            result=convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        lastPosition = position;

        viewHolder.txtNom.setText(model.getNom());
        viewHolder.txtPrenom.setText(model.getPrenom());
        viewHolder.txtAge.setText(model.getAge());

        viewHolder.txtAge.setOnClickListener(this);
        viewHolder.txtAge.setTag(position);

        // Return the completed view to render on screen
        return convertView;
    }

}