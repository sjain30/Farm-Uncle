package com.ntas.FarmUncle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProductDetails extends AppCompatActivity {

    private TextView id, amount, status, method, name, qty, description;
    private ImageView imageView;
    private static final String position ="Position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Intent intent = getIntent();
        int pos = intent.getExtras().getInt(position);
        BottomNavigationView bottomNavigationView =  findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_order);

        id = findViewById(R.id.orderId);
        amount = findViewById(R.id.amount);
        status = findViewById(R.id.status);
        method = findViewById(R.id.PaymentMethod);
        name = findViewById(R.id.name);
        qty = findViewById(R.id.quantity);
        description = findViewById(R.id.description);
        imageView = findViewById(R.id.imageView4);

        id.setText(String.format("Order Id: %s",Integer.toString(MyOrders.orders[pos].getOrderId())));
        amount.setText(String.format("Order Amount: %s",MyOrders.orders[pos].getOrderAmount()));
        status.setText(String.format("Delivery Status: %s",MyOrders.orders[pos].getStatus()));
        method.setText(String.format("Payment Method: %s",MyOrders.orders[pos].getPaymentMethod()));
        name.setText(MyOrders.orders[pos].getProductName());
        qty.setText(String.format("Quantity: %s",MyOrders.orders[pos].getQuantity()));
        description.setText(MyOrders.orders[pos].getProductDescription());
        imageView.setImageResource(MyOrders.orders[pos].getImageResource());

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_shop:
                        startActivity(new Intent(getApplicationContext(),ShopActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_cart:
                        startActivity(new Intent(getApplicationContext(),CartActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.nav_order:
                        return true;
                }
                return false;
            }
        });
    }
}
