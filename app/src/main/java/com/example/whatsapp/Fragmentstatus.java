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

public class Fragmentstatus extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<Contact> contactList;
    public Fragmentstatus(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.status_fragments,container,false);
        recyclerView=(RecyclerView) v.findViewById(R.id.status_recycleview);
        StatusAdapter recyclerViewAdapter=new StatusAdapter(getContext(),contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contactList=new ArrayList<>();
        contactList.add(new Contact("Person1","12 minutes ago","7:43 pm",R.drawable.person1));
        contactList.add(new Contact("Person2","22 minutes ago","6:43 am",R.drawable.person2));
        contactList.add(new Contact("Person3","32 minutes ago","9:43 pm",R.drawable.person3));
        contactList.add(new Contact("Person4","42 minutes ago","6:43 pm",R.drawable.person4));
        contactList.add(new Contact("Person5","52 minutes ago","3:43 pm",R.drawable.person5));
        contactList.add(new Contact("Person1","Today, 9:34 am","7:43 pm",R.drawable.person1));
        contactList.add(new Contact("Person2","Today, 8:34 am","6:43 am",R.drawable.person2));
        contactList.add(new Contact("Person3","Today, 7:34 am","9:43 pm",R.drawable.person3));
        contactList.add(new Contact("Person4","Today, 6:34 am","6:43 pm",R.drawable.person4));
        contactList.add(new Contact("Person5","Today, 5:34 am","3:43 pm",R.drawable.person5));

    }
}
