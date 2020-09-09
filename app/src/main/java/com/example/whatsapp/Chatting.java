package com.example.whatsapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Chatting extends AppCompatActivity {
    EditText sen1;
    EditText sen2;
    EditText sen3;
    EditText rec1;
    EditText rec2;
    EditText rec3;
    int pos=0;
    public void send(View view){
        pos+=1;
        if(pos==1){
            sen1.setText(sen1.getText());
        }
        else if(pos==2){
            sen2.setText(sen2.getText());
        }
        else{
            sen3.setText(sen3.getText());
        }
    }
    public void receive(View view){
        pos+=1;
        if(pos==1){
            rec1.setText(rec1.getText());
        }
        else if(pos==2){
            rec2.setText(rec2.getText());
        }
        else{
            rec3.setText(rec3.getText());
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.personal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatting);
        sen1=(EditText)findViewById(R.id.s1);
        sen2=(EditText)findViewById(R.id.s2);
        sen3=(EditText)findViewById(R.id.s3);
        rec1=(EditText)findViewById(R.id.r1);
        rec2=(EditText)findViewById(R.id.r2);
        rec3=(EditText)findViewById(R.id.r3);
    }
}
