package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Fragmentchat extends Fragment {
    View v;
    static int l=0;
    private RecyclerView recyclerView;
    private List<Contact> contactList;
    public Fragmentchat(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.chats_fragments,container,false);
        recyclerView=(RecyclerView) v.findViewById(R.id.chat_recycleview);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);


        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contactList=new ArrayList<>();
        contactList.add(new Contact("Person1","last message","7:43 pm",R.drawable.person1));
        contactList.add(new Contact("Person2","last message","6:43 am",R.drawable.person2));
        contactList.add(new Contact("Person3","last message","9:43 pm",R.drawable.person3));
        contactList.add(new Contact("Person4","last message","6:43 pm",R.drawable.person4));
        contactList.add(new Contact("Person5","last message","3:43 pm",R.drawable.person5));
        contactList.add(new Contact("Person1","last message","7:43 pm",R.drawable.person1));
        contactList.add(new Contact("Person2","last message","6:43 am",R.drawable.person2));
        contactList.add(new Contact("Person3","last message","9:43 pm",R.drawable.person3));
        contactList.add(new Contact("Person4","last message","6:43 pm",R.drawable.person4));
        contactList.add(new Contact("Person5","last message","3:43 pm",R.drawable.person5));

    }
}
