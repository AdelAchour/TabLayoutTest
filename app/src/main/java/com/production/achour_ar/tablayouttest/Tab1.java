package com.production.achour_ar.tablayouttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Belal on 2/3/2016.
 */

//Our class extending fragment
public class Tab1 extends Fragment {

    ArrayList<Model> model;
    private static Adapter adapter;
    ListView listView;

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab1, container, false);

        listView=(ListView)view.findViewById(R.id.list);


        model = new ArrayList<>();

        model.add(new Model("Achour","Adel",23));
        model.add(new Model("Badsi","Mohamed",30));
        model.add(new Model("Belkhiri","Bachir",23));

                adapter = new Adapter(model, getActivity());
                listView.setAdapter(adapter);


        return view;
    }
}