package com.example.stikmoap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class dashboard extends AppCompatActivity {
    ViewPager mViewPager,mViewPager2;
//    ImageView website;

    int[] images = {
            R.drawable.bps,
            R.drawable.logo,
            R.drawable.motto,
            R.drawable.satussl,
            R.drawable.duasl
    };
    int[] images2 = {
            R.drawable.grafikone,
            R.drawable.grafiktwo,
            R.drawable.grafikthree
    };

    //objek slideradapter
    SliderAdapter mViewPagerAdapter;
    SliderAdapter2 mViewPagerAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mViewPagerAdapter = new SliderAdapter(dashboard.this, images);
        mViewPager.setAdapter(mViewPagerAdapter);

        //viewpager2
        mViewPager2 = (ViewPager)findViewById(R.id.viewpager2);
        mViewPagerAdapter2 = new SliderAdapter2(dashboard.this, images2);
        mViewPager2.setAdapter(mViewPagerAdapter2);

//        website = findViewById(R.id.website);
//        website.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://mojokertokab.bps.go.id/";
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });


    }


    public void indikator(View view) {
        Intent i = new Intent(dashboard.this, indikator.class);
        startActivity(i);
    }

    public void publikasi(View view) {
        Intent i = new Intent(dashboard.this, publikasi.class);
        startActivity(i);
    }

    public void arc(View view) {
        Intent i = new Intent(dashboard.this, arc.class);
        startActivity(i);
    }

    public void brs(View view) {
        Intent i = new Intent(dashboard.this, brs.class);
        startActivity(i);
    }

    public void infografis(View view) {
        Intent i = new Intent(dashboard.this, infografis.class);
        startActivity(i);
    }

    public void hub_kami(View view) {
        Intent i = new Intent(dashboard.this, hub_kami.class);
        startActivity(i);
    }

}