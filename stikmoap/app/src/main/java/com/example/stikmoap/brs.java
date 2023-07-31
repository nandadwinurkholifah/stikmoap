package com.example.stikmoap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

public class brs extends AppCompatActivity {
    String link, judul, brs_judul1, brs_pdf1,brs_judul2,brs_pdf2,brs_judul3,brs_pdf3,brs_judul4,brs_pdf4,brs_judul5,brs_pdf5,brs_judul6,brs_pdf6,brs_judul7,brs_pdf7,brs_judul8,brs_pdf8,brs_judul9,brs_pdf9,brs_judul10,brs_pdf10;
    TextView tbrs1, tbrs2, tbrs3,tbrs4,tbrs5,tbrs6,tbrs7,tbrs8,tbrs9,tbrs10;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10;

    String url = "https://62c66cc32b03e73a58ccef36.mockapi.io/api/v1/brs/1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brs);
        getSupportActionBar().hide();

        imageView1 = findViewById(R.id.brs1);
        imageView2 = findViewById(R.id.brs2);
        imageView3 = findViewById(R.id.brs3);
        imageView4 = findViewById(R.id.brs4);
        imageView5 = findViewById(R.id.brs5);
        imageView6 = findViewById(R.id.brs6);
        imageView7 = findViewById(R.id.brs7);
        imageView8 = findViewById(R.id.brs8);
        imageView9 = findViewById(R.id.brs9);
        imageView10 = findViewById(R.id.brs10);
        tampilgambar();


        Toast.makeText(brs.this,"Memuat Data",Toast.LENGTH_SHORT).show();
        tbrs1 = findViewById(R.id.tbrs1);
        tbrs2 = findViewById(R.id.tbrs2);
        tbrs3 = findViewById(R.id.tbrs3);
        tbrs4 = findViewById(R.id.tbrs4);
        tbrs5 = findViewById(R.id.tbrs5);
        tbrs6 = findViewById(R.id.tbrs6);
        tbrs7 = findViewById(R.id.tbrs7);
        tbrs8 = findViewById(R.id.tbrs8);
        tbrs9 = findViewById(R.id.tbrs9);
        tbrs10 = findViewById(R.id.tbrs10);

        tampilData();
        cliklistener();
    }

    private void cliklistener() {
        tbrs1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link = brs_pdf1;
                judul = brs_judul1;
                DownloadFiles(link, judul);
            }
        });

        tbrs2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link = brs_pdf2;
                judul = brs_judul2;
                DownloadFiles(link, judul);
            }
        });

        tbrs3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link = brs_pdf3;
                judul = brs_judul3;
                DownloadFiles(link, judul);
            }
        });

        tbrs4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf4;
                judul=brs_judul4;
                DownloadFiles(link,judul);
            }
        });

        tbrs5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf5;
                judul=brs_judul5;
                DownloadFiles(link,judul);
            }
        });

        tbrs6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf6;
                judul=brs_judul6;
                DownloadFiles(link,judul);
            }
        });

        tbrs7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf7;
                judul=brs_judul7;
                DownloadFiles(link,judul);
            }
        });

        tbrs8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf8;
                judul=brs_judul8;
                DownloadFiles(link,judul);
            }
        });

        tbrs9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf9;
                judul=brs_judul9;
                DownloadFiles(link,judul);
            }
        });

        tbrs10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=brs_pdf10;
                judul=brs_judul10;
                DownloadFiles(link,judul);
            }
        });
    }

    private void tampilData() {

        RequestQueue queue= Volley.newRequestQueue((this));

        JSONObject jsonObject= new JSONObject();
        final  String requestBody= jsonObject.toString();

        StringRequest stringRequest=new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject ja = new JSONObject(response.toString());
                    brs_judul1=ja.getString("brs_judul1");
                    brs_pdf1=ja.getString("brs_pdf1");
                    brs_judul2=ja.getString("brs_judul2");
                    brs_pdf2=ja.getString("brs_pdf2");
                    brs_judul3=ja.getString("brs_judul3");
                    brs_pdf3=ja.getString("brs_pdf3");
                    brs_judul4=ja.getString("brs_judul4");
                    brs_pdf4=ja.getString("brs_pdf4");
                    brs_judul5=ja.getString("brs_judul5");
                    brs_pdf5=ja.getString("brs_pdf5");
                    brs_judul6=ja.getString("brs_judul6");
                    brs_pdf6=ja.getString("brs_pdf6");
                    brs_judul7=ja.getString("brs_judul7");
                    brs_pdf7=ja.getString("brs_pdf7");
                    brs_judul8=ja.getString("brs_judul8");
                    brs_pdf8=ja.getString("brs_pdf8");
                    brs_judul9=ja.getString("brs_judul9");
                    brs_pdf9=ja.getString("brs_pdf9");
                    brs_judul10=ja.getString("brs_judul10");
                    brs_pdf10=ja.getString("brs_pdf10");

                    tbrs1.setText(brs_judul1);
                    tbrs2.setText(brs_judul2);
                    tbrs3.setText(brs_judul3);
                    tbrs4.setText(brs_judul4);
                    tbrs5.setText(brs_judul5);
                    tbrs6.setText(brs_judul6);
                    tbrs7.setText(brs_judul7);
                    tbrs8.setText(brs_judul8);
                    tbrs9.setText(brs_judul9);
                    tbrs10.setText(brs_judul10);

                    Toast.makeText(brs.this,"Dapat Mulai Mendownload Data",Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(brs.this,"Tidak Dapat Mendownload Data " +error,Toast.LENGTH_SHORT).show();

            }
        }
        );
        queue.add(stringRequest);

    }

    private void tampilgambar(){
        RequestQueue queue = Volley.newRequestQueue(this);

        JSONObject jsonObject = new JSONObject();
        final String requstBody = jsonObject.toString();

        StringRequest stringRequest = new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jo = new JSONObject(response.toString());

                    //menampilkan gambar1
                    String gambar1 = jo.getString("brs_gmbr1");
                    Glide.with(brs.this)
                            .load(gambar1)
                            .into(imageView1);

                    //menampilkan gambar2
                    String gambar2 = jo.getString("brs_gmbr2");
                    Glide.with(brs.this)
                            .load(gambar2)
                            .into(imageView2);

                    //menampilkan gambar3
                    String gambar3 = jo.getString("brs_gmbr3");
                    Glide.with(brs.this)
                            .load(gambar3)
                            .into(imageView3);

                    //menampilkan gambar4
                    String gambar4 = jo.getString("brs_gmbr4");
                    Glide.with(brs.this)
                            .load(gambar4)
                            .into(imageView4);

                    //menampilkan gambar5
                    String gambar5 = jo.getString("brs_gmbr5");
                    Glide.with(brs.this)
                            .load(gambar5)
                            .into(imageView5);

                    //menampilkan gambar6
                    String gambar6 = jo.getString("brs_gmbr6");
                    Glide.with(brs.this)
                            .load(gambar6)
                            .into(imageView6);

                    //menampilkan gambar7
                    String gambar7 = jo.getString("brs_gmbr7");
                    Glide.with(brs.this)
                            .load(gambar7)
                            .into(imageView7);

                    //menampilkan gambar8
                    String gambar8 = jo.getString("brs_gmbr8");
                    Glide.with(brs.this)
                            .load(gambar8)
                            .into(imageView8);

                    //menampilkan gambar9
                    String gambar9 = jo.getString("brs_gmbr9");
                    Glide.with(brs.this)
                            .load(gambar9)
                            .into(imageView9);

                    //menampilkan gambar10
                    String gambar10 = jo.getString("brs_gmbr10");
                    Glide.with(brs.this)
                            .load(gambar10)
                            .into(imageView10);

                    Toast.makeText(brs.this,"Berhasil Memuat Data",Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(brs.this,"Gagal Mengambil Api" + error ,Toast.LENGTH_SHORT).show();
            }
        }
        );
        queue.add(stringRequest);

    }

    public void DownloadFiles(String link, String judul){
        DownloadManager downloadmanager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(link);

        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setTitle(judul);
        request.setDescription("Downloading");
        Toast.makeText(brs.this,"Sedang Mendownload Data...",Toast.LENGTH_SHORT).show();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setVisibleInDownloadsUi(true);
//        request.setDestinationUri(Uri.parse("file://" + folderName + "/myfile.mp3"));

        downloadmanager.enqueue(request);
    }
}