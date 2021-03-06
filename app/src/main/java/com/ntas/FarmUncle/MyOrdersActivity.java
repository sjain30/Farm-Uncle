package com.ntas.FarmUncle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyOrdersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    public static MyOrders[] orders = {new MyOrders(1,100,2, R.drawable.cookies,"Cash", "In transit", "Cookies", "Fresh Oat Cookies"),
            new MyOrders(2,100, 3, R.drawable.sandwich,"PayTm", "Delivered", "Sandwhich", "Vegetable Sandwhich"),
            new MyOrders(3,150, 4, R.drawable.pancakes,"Debit Card", "Delivered", "Pancakes", "Soft pancakes with maple syrup")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

        BottomNavigationView bottomNavigationView =  findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_order);

        recyclerView =findViewById(R.id.ordersRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter= new OrdersAdapter(this);
        recyclerView.setAdapter(recyclerAdapter);

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

    public void productDetails()
    {
        Intent intent = new Intent(MyOrdersActivity.this,ProductDetails.class);
        startActivity(intent);
    }
}
