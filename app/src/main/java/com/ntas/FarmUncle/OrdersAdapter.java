package com.ntas.FarmUncle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.ViewHolder> {

    private Context context;

    public OrdersAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ProductDetails.class);
                intent.putExtra("Position",position);
                context.startActivity(intent);
            }
        });

        holder.orderId.setText("Order Id: "+Integer.toString(MyOrders.orders[position].getOrderId()));
        holder.deliveryStatus.setText("Delivery Status: "+MyOrders.orders[position].getStatus());
        holder.orderAmount.setText("Order Amount: "+MyOrders.orders[position].getOrderAmount());
        holder.name.setText("Description:\n"+MyOrders.orders[position].getProductDescription());
        holder.imageView.setImageResource(MyOrders.orders[position].getImageResource());
    }

    @Override
    public int getItemCount() {
        return MyOrders.orders.length;
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView orderId, deliveryStatus, orderAmount, name;
        public ImageView imageView;
        public LinearLayout linearLayout;
        private Context context;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            orderId=itemView.findViewById(R.id.orderid);
            deliveryStatus=itemView.findViewById(R.id.deliveryStatus);
            orderAmount=itemView.findViewById(R.id.orderAmount);
            name =itemView.findViewById(R.id.productName);
            imageView=itemView.findViewById(R.id.imageView2);
            linearLayout = itemView.findViewById(R.id.ordersCardLayout);
        }
    }
}
