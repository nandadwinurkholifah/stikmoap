package com.example.stikmoap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hub_kami extends AppCompatActivity {
    ImageView wa,gmail,web,maps,insta,fb,yt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub_kami);
        getSupportActionBar().hide();

        wa = findViewById(R.id.wa);
        gmail = findViewById(R.id.gmail);
        web = findViewById(R.id.web);
        maps = findViewById(R.id.maps);
        insta = findViewById(R.id.insta);
        fb = findViewById(R.id.fb);
        yt = findViewById(R.id.yt);

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String url = "https://wa.me/+628113693516";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String url = "https://mail.google.com/mail/u/0/?view=cm&tf=1&fs=1&to=bps3516@bps.go.id";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://mojokertokab.bps.go.id/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://goo.gl/maps/hUrsgZ4QeP9ExjsWA";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/bpsmojokertokab/?hl=id";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/BPSKabMojokerto";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/channel/UCriLIpA0PneXRJlk_Z0gfbA";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}