package com.example.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    Context context;
    List<Contact> data;
    public RecyclerViewAdapter(Context context, List<Contact> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType){
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.item_chats,parent,false);
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
        holder.tim.setText(data.get(position).getTime());
        holder.lmsg.setText(data.get(position).getMsg());
        holder.pname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,PersonalChat.class);
                intent.putExtra("name",data.get(position).getName());
               // holder.pimage.buildDrawingCache();
               // Bitmap bitmap=holder.pimage.getDrawingCache();
               // Bundle bundle=new Bundle();
              //  bundle.putParcelable("image",bitmap);
                //intent.putExtra("image",data.get(position).getImage());
                //intent.putExtra("image",bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView pname;
        private LinearLayout chatitem;
        private TextView lmsg;
        private TextView tim;
        private ImageView pimage;
        RecyclerViewClickListener listener;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            chatitem=(LinearLayout) itemView.findViewById(R.id.chatview);
            pname=(TextView) itemView.findViewById(R.id.name);
            lmsg=(TextView) itemView.findViewById(R.id.lastmsg);
            tim=(TextView) itemView.findViewById(R.id.lasttime);
            pimage=(ImageView) itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v,getAdapterPosition());
        }

        public interface RecyclerViewClickListener{
            void onClick(View v,int position);
        }
    }
}
