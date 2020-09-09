package com.example.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.MyViewHolder>{
    Context context;
    List<Contact> data;
    public CallAdapter(Context context, List<Contact> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType){
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.call,parent,false);
        final MyViewHolder myViewHolder=new MyViewHolder(v);
        myViewHolder.chatitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.pname.setText(data.get(position).getName());
        holder.pimage.setImageResource(data.get(position).getImage());
        holder.lmsg.setText(data.get(position).getMsg());
        holder.pname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,PersonalChat.class);
                intent.putExtra("name",data.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView pname;
        private LinearLayout chatitem;
        private TextView lmsg;
       // private TextView tim;
        private ImageView pimage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            chatitem=(LinearLayout) itemView.findViewById(R.id.chatview);
            pname=(TextView) itemView.findViewById(R.id.name);
            lmsg=(TextView) itemView.findViewById(R.id.lastmsg);
           // tim=(TextView) itemView.findViewById(R.id.lasttime);
            pimage=(ImageView) itemView.findViewById(R.id.img);

        }


    }
}
