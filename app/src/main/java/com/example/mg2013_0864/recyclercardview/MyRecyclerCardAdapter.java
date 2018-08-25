package com.example.mg2013_0864.recyclercardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyRecyclerCardAdapter extends RecyclerView.Adapter<MyRecyclerCardAdapter.MyRecyclerItemViewHolder> {

    private final ArrayList<MarcaPais> items;
    private final Context context;

    public MyRecyclerCardAdapter(Context context , ArrayList<MarcaPais> items){
        this.context = context;
        this.items = items;
    }

    @Override public int getItemViewType(int position){
        if (position == 0){
            return R.layout.header_layout;
        }else if (position % 2 == 0){
            return R.layout.body_layout;
        }else {
            return R.layout.foot_layout;
        }
    }

    @Override public MyRecyclerItemViewHolder onCreateViewHolder(ViewGroup parent, int layout) {
        View view = LayoutInflater.from(context).inflate(layout, parent, false);
        MyRecyclerItemViewHolder holder = new MyRecyclerItemViewHolder(view);
        return holder;
    }
    @Override public void onBindViewHolder(MyRecyclerItemViewHolder holder, int position) {
        holder.marca.setText(items.get(position).getMarca());
        holder.marca.setTag(items.get(position).getMarca());
        holder.pais.setText(items.get(position).getPais());
        holder.pais.setTag(items.get(position).getPais());

        holder.marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, view.getTag().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.pais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, view.getTag().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override  public int getItemCount() {  return items.size(); }

    public static class MyRecyclerItemViewHolder extends RecyclerView.ViewHolder {

        public TextView marca;
        public TextView pais;

        public MyRecyclerItemViewHolder(View itemView) {
            super(itemView);
            marca = itemView.findViewById(R.id.marcaTextView);
            pais = itemView.findViewById(R.id.paisTextView);
        }
    }
}
