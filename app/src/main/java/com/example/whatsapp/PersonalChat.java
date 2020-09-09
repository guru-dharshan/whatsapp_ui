package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalChat extends AppCompatActivity {
    TextView name;
    ImageView dp;
    ImageView face;
    ImageView attach;
    ImageView send;
    ImageView camera;
    EditText msg;
    public void mssend(View view){
        //View view1= LayoutInflater.from(PersonalChat.this).inflate(R.layout.custom_toast,(ViewGroup).find)
        Toast.makeText(this, msg.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    private final static int Request_image_capture=101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_chat);
        name=findViewById(R.id.mname);
        dp=findViewById(R.id.mdp);
        face=findViewById(R.id.mface);
        attach=findViewById(R.id.mattach);
        send=findViewById(R.id.msend);
        camera=findViewById(R.id.mcamera);
        msg=findViewById(R.id.mmsg);
        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));
       // Bundle extras = getIntent().getExtras();
        //Bitmap bmp = (Bitmap) extras.getParcelable("image");
       // dp.setImageBitmap(bmp );
        custtoast(attach);
        custtoastcam(camera);
        facetoast(face);
    }
    public void custtoast(ImageView imageView){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PersonalChat.this, "Attach", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void custtoastcam(ImageView imageView){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(PersonalChat.this, "Attach", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(intent,Request_image_capture);
                }
            }
        });
    }
    public void facetoast(ImageView imageView){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater= getLayoutInflater();
                View view=layoutInflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custcon));
                Toast toast = new Toast(getApplicationContext());
                ImageView imageView1=view.findViewById(R.id.toastt);
                imageView1.setImageResource(R.drawable.ic_face);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(view);
                toast.show();
            }
        });

    }
}