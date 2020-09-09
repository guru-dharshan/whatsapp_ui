package com.example.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmentcamera extends Fragment {
    View v;
    int Result=101;
    Context context;
    public Fragmentcamera(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.camera_fragments,container,false);
        //Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //startActivityForResult(intent,Result);
        return v;
    }
}
