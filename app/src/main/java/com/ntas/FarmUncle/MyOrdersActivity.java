package com.ntas.FarmUncle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyOrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

        BottomNavigationView bottomNavigationView =  findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_order);


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
