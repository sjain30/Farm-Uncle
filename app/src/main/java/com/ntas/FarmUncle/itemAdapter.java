package com.ntas.FarmUncle;



import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ImageButton;

import android.widget.ImageView;

import android.widget.TextView;



import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;



public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ViewHolder> {



    private Context context;

    private String[] product_list = {"Product 1", "Product 2", "Product 3", "Product 4"};



    public itemAdapter(Context context) {

        this.context = context;

    }



    @NonNull

    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new itemAdapter.ViewHolder(view);

    }



    @Override

    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {



        Foods foods = Foods.foods[position];



        holder.title.setText(foods.getName());

        holder.description.setText(foods.getDescription());

        holder.imageView.setImageResource(foods.getImageresource());

        holder.minus.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                int qty = Integer.parseInt(holder.qty.getText().toString());

                if (qty>0){

                    qty--;

                }

                holder.qty.setText(String.valueOf(qty));

            }

        });



        holder.add.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                int qty = Integer.parseInt(holder.qty.getText().toString());

                qty++;

                holder.qty.setText(String.valueOf(qty));

            }

        });

    }



    @Override

    public int getItemCount() {

        return Foods.foods.length;

    }



    public class ViewHolder extends RecyclerView.ViewHolder{



        public ImageButton minus, add;

        public ImageView imageView;

        public TextView title, description, qty;



        public ViewHolder(@NonNull View itemView) {

            super(itemView);



            minus = itemView.findViewById(R.id.decrease);

            add = itemView.findViewById(R.id.increase);

            imageView = itemView.findViewById(R.id.imageView3);

            title = itemView.findViewById(R.id.textView);

            description = itemView.findViewById(R.id.textView2);

            qty = itemView.findViewById(R.id.qtyTextview);

        }

    }

}