package com.production.achour_ar.tablayouttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentC extends Fragment {

    ArrayList<Model> model;
    ListView list;


    public FragmentC() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        /*list = (ListView) view.findViewById(R.id.list);


        model = new ArrayList<>();

        model.add(new Model("Hey bro"));


        CustomAdapter adapter = new CustomAdapter(model,getActivity());
        list.setAdapter(adapter);*/

        return view;
    }
}
