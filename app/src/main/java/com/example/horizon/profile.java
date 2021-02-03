package com.example.horizon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class profile extends Fragment {
    RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.profile, container, false);
        recyclerView=(RecyclerView)rootview.findViewById(R.id.recycle1);
        String names[]={"Kavya sharma","Rahul kumar","Suman Tamta","Sumit Rawat","Himani Joshi","Salman","Kavita Joshi","Sagal Yadav"};
        String number[]={"90706856464","95967463632","8796959430","7960593621","7058595050"};
        String emails[]={"Kavyasharma@gmail.com","Rahulkumar@gmail.com","Suman@gmail.com","SumitRawat@gmail.com","HimaniJoshi@gmail.com","Salman@gmail.com","Kavita_Joshi@gmail.com","SagalYadav@gmail.com"};

        layoutManager=new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new adapter(names,number,emails,getActivity()));
        return rootview;
    }
}
