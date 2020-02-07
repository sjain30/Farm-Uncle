package com.ntas.FarmUncle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ShopActivity extends AppCompatActivity {


    private ViewPager viewPager;

    private PageAdapter adapter;

    private LinearLayout dotsLayout;

    private TextView[] dots;

    private RecyclerView categoryView, itemView;

    private RecyclerView.Adapter categoryAdapter, itemAdapter;

    private int[] layouts = {R.layout.slider1, R.layout.slider2, R.layout.slider3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        BottomNavigationView bottomNavigationView =  findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_shop);

        dotsLayout = findViewById(R.id.dotsLayout);

        viewPager = findViewById(R.id.viewPager);

        adapter = new PageAdapter(layouts, this);

        viewPager.setAdapter(adapter);

        setViewPager();

        createDots(0);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        categoryView = findViewById(R.id.recyclerView);

        categoryView.setHasFixedSize(true);

        categoryView.setLayoutManager(layoutManager);

        categoryAdapter = new MyAdapter(this);

        categoryView.setAdapter(categoryAdapter);



        itemView = findViewById(R.id.itemRecyclerView);

        itemView.setHasFixedSize(true);

        itemView.setLayoutManager(new LinearLayoutManager(this));

        itemAdapter = new itemAdapter(this);

        itemView.setAdapter(itemAdapter);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_order:
                        startActivity(new Intent(getApplicationContext(),MyOrdersActivity.class));
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

                    case R.id.nav_shop:
                        return true;
                }
                return false;
            }
        });
    }

    private void setViewPager() {

        adapter = new PageAdapter(layouts, this);

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {



            }



            @Override

            public void onPageSelected(int position) {

                createDots(position);

/*                 currentPage=position;

                 if (currentPage==0){

                     back.setEnabled(false);

                     next.setEnabled(true);

                     back.setVisibility(View.INVISIBLE);

                 }

                 else if (currentPage==dots.length-1){

                     back.setEnabled(true);

                     next.setEnabled(true);

                     back.setVisibility(View.VISIBLE);

                     next.setText("FINISH");

                 }

                 else{

                     back.setEnabled(true);

                     next.setEnabled(true);

                     back.setVisibility(View.VISIBLE);

                     next.setText("NEXT");

                 }*/

            }



            @Override

            public void onPageScrollStateChanged(int state) {



            }

        });

    }



    private void createDots(int position) {

        dots = new TextView[layouts.length];

        dotsLayout.removeAllViews();

        for (int i = 0; i < layouts.length; i++) {

            dots[i] = new TextView(this);

            dots[i].setText(Html.fromHtml("&#8226"));

            dots[i].setTextSize(35);



            if (i == position) {

                dots[i].setTextColor(getResources().getColor(R.color.colorAccent));

            } else

                dots[i].setTextColor(getResources().getColor(R.color.colorPrimaryDark));

            dotsLayout.addView(dots[i]);

        }

    }

}

