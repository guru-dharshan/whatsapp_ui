package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private RecyclerViewAdapter.MyViewHolder.RecyclerViewClickListener listener;
   // FloatingActionButton f1,f2,f3,f4;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    //@SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //f1=(FloatingActionButton) findViewById(R.id.mess);
       // if(Fragmentchat.l==0){
            //f1.setVisibility(View.INVISIBLE);
       // }
        toolbar=findViewById(R.id.cusact);
        setSupportActionBar(toolbar);
        tabLayout=(TabLayout) findViewById(R.id.tablay);
        viewPager=(ViewPager) findViewById(R.id.viewpager);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new Fragmentcamera(),"");
        viewPagerAdapter.AddFragment(new Fragmentchat(),"CHATS");
        viewPagerAdapter.AddFragment(new Fragmentstatus(),"STATUS");
        viewPagerAdapter.AddFragment(new Fragmentcall(),"CALLS");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        setOnClickListener();
        viewPager.setCurrentItem(1);
    }

    private void setOnClickListener() {
        listener=new RecyclerViewAdapter.MyViewHolder.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent i=new Intent(getApplicationContext(),Chatting.class);
                startActivity(i);
            }
        };
    }
}