package com.example.horizon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class star extends Fragment {
    RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.staractivity, container, false);
        recyclerView=(RecyclerView)root.findViewById(R.id.recyclestar);
        String names[]={"Arduino Automation","Artificial Intelligence","Android Development","Web Development","Data Science"};
        String dates[]={"12 March 6:30","1 March 5:00","4 April 4:30","30 March 6:30","22 June 7:30"};
        layoutManager=new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new adapter2(names,dates,getActivity()));
        return root;
    }
}