package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fragmentcall extends Fragment {
    View v;
    RecyclerView recyclerView;
    private List<Contact> calllist;
    public Fragmentcall(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.call_fragment,container,false);
        recyclerView=(RecyclerView) v.findViewById(R.id.call_recycleview);
        CallAdapter recyclerViewAdapter=new CallAdapter(getContext(),calllist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calllist=new ArrayList<>();
        calllist.add(new Contact("Person1","26 August, 9:45 am","7:43 pm",R.drawable.person1));
        calllist.add(new Contact("Person2","26 July, 9:45 am","6:43 am",R.drawable.person2));
        calllist.add(new Contact("Person3","20 July, 9:45 am","9:43 pm",R.drawable.person3));
        calllist.add(new Contact("Person4","16 July, 9:45 am","6:43 pm",R.drawable.person4));
        calllist.add(new Contact("Person5","6 July, 9:45 am","3:43 pm",R.drawable.person5));
        calllist.add(new Contact("Person1","26 June, 9:45 am","7:43 pm",R.drawable.person1));
        calllist.add(new Contact("Person2","16 June, 9:45 am","6:43 am",R.drawable.person2));
        calllist.add(new Contact("Person3","6 June, 9:45 am","9:43 pm",R.drawable.person3));
        calllist.add(new Contact("Person4","26 May, 9:45 am","6:43 pm",R.drawable.person4));
        calllist.add(new Contact("Person5","16 May, 9:45 am","3:43 pm",R.drawable.person5));
    }
}
