package com.example.stikmoap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
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

public class publikasi extends AppCompatActivity {
    String link, judul,pub_judul1,pub_pdf1,pub_judul2,pub_pdf2,pub_judul3,pub_pdf3,pub_judul4,pub_pdf4,pub_judul5,pub_pdf5,pub_judul6,pub_pdf6,pub_judul7,pub_pdf7,pub_judul8,pub_pdf8,pub_judul9,pub_pdf9,pub_judul10,pub_pdf10;
    TextView tpub1, tpub2, tpub3, tpub4,tpub5,tpub6,tpub7,tpub8,tpub9,tpub10;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10;

    String url="https://62c66cc32b03e73a58ccef36.mockapi.io/api/v1/pdfall/1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publikasi);
        getSupportActionBar().hide();

        imageView1 = findViewById(R.id.pub1);
        imageView2 = findViewById(R.id.pub2);
        imageView3 = findViewById(R.id.pub3);
        imageView4 = findViewById(R.id.pub4);
        imageView5 = findViewById(R.id.pub5);
        imageView6 = findViewById(R.id.pub6);
        imageView7 = findViewById(R.id.pub7);
        imageView8 = findViewById(R.id.pub8);
        imageView9 = findViewById(R.id.pub9);
        imageView10 = findViewById(R.id.pub10);
        tampilgambar();

        Toast.makeText(publikasi.this,"Memuat Data",Toast.LENGTH_SHORT).show();
        tpub1 = findViewById(R.id.tpub1);
        tpub2 = findViewById(R.id.tpub2);
        tpub3 = findViewById(R.id.tpub3);
        tpub4 = findViewById(R.id.tpub4);
        tpub5 = findViewById(R.id.tpub5);
        tpub6 = findViewById(R.id.tpub6);
        tpub7 = findViewById(R.id.tpub7);
        tpub8 = findViewById(R.id.tpub8);
        tpub9 = findViewById(R.id.tpub9);
        tpub10 = findViewById(R.id.tpub10);


        tampilData();
        cliklistener();
    }

    private void cliklistener() {
        tpub1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf1;
                judul=pub_judul1;
                DownloadFiles(link,judul);
            }
        });
        tpub2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf2;
                judul=pub_judul2;
                DownloadFiles(link,judul);
            }
        });
        tpub3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf3;
                judul=pub_judul3;
                DownloadFiles(link,judul);
            }
        });
        tpub4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf4;
                judul=pub_judul4;
                DownloadFiles(link,judul);
            }
        });
        tpub5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf5;
                judul=pub_judul5;
                DownloadFiles(link,judul);
            }
        });
        tpub6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf6;
                judul=pub_judul6;
                DownloadFiles(link,judul);
            }
        });
        tpub7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf7;
                judul=pub_judul7;
                DownloadFiles(link,judul);
            }
        });
        tpub8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf8;
                judul=pub_judul8;
                DownloadFiles(link,judul);
            }
        });
        tpub9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf9;
                judul=pub_judul9;
                DownloadFiles(link,judul);
            }
        });
        tpub10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                link=pub_pdf10;
                judul=pub_judul10;
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
                     pub_judul1=ja.getString("pub_judul1");
                     pub_pdf1=ja.getString("pub_pdf1");
                     pub_judul2=ja.getString("pub_judul2");
                     pub_pdf2=ja.getString("pub_pdf2");
                     pub_judul3=ja.getString("pub_judul3");
                     pub_pdf3=ja.getString("pub_pdf3");
                     pub_judul4=ja.getString("pub_judul4");
                     pub_pdf4=ja.getString("pub_pdf4");
                     pub_judul5=ja.getString("pub_judul5");
                     pub_pdf5=ja.getString("pub_pdf5");
                     pub_judul6=ja.getString("pub_judul6");
                     pub_pdf6=ja.getString("pub_pdf6");
                     pub_judul7=ja.getString("pub_judul7");
                     pub_pdf7=ja.getString("pub_pdf7");
                     pub_judul8=ja.getString("pub_judul8");
                     pub_pdf8=ja.getString("pub_pdf8");
                     pub_judul9=ja.getString("pub_judul9");
                     pub_pdf9=ja.getString("pub_pdf9");
                     pub_judul10=ja.getString("pub_judul10");
                     pub_pdf10=ja.getString("pub_pdf10");

                    tpub1.setText(pub_judul1);
                    tpub2.setText(pub_judul2);
                    tpub3.setText(pub_judul3);
                    tpub4.setText(pub_judul4);
                    tpub5.setText(pub_judul5);
                    tpub6.setText(pub_judul6);
                    tpub7.setText(pub_judul7);
                    tpub8.setText(pub_judul8);
                    tpub9.setText(pub_judul9);
                    tpub10.setText(pub_judul10);

                    Toast.makeText(publikasi.this,"Dapat Mulai Mendownload Data",Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(publikasi.this,"Tidak Dapat Mendownload Data " +error,Toast.LENGTH_SHORT).show();

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
                    String gambar1 = jo.getString("pub_gmbr1");
                    Glide.with(publikasi.this)
                            .load(gambar1)
                            .into(imageView1);

                    //menampilkan gambar2
                    String gambar2 = jo.getString("pub_gmbr2");
                    Glide.with(publikasi.this)
                            .load(gambar2)
                            .into(imageView2);

                    //menampilkan gambar3
                    String gambar3 = jo.getString("pub_gmbr3");
                    Glide.with(publikasi.this)
                            .load(gambar3)
                            .into(imageView3);

                    //menampilkan gambar4
                    String gambar4 = jo.getString("pub_gmbr4");
                    Glide.with(publikasi.this)
                            .load(gambar4)
                            .into(imageView4);

                    //menampilkan gambar5
                    String gambar5 = jo.getString("pub_gmbr5");
                    Glide.with(publikasi.this)
                            .load(gambar5)
                            .into(imageView5);

                    //menampilkan gambar6
                    String gambar6 = jo.getString("pub_gmbr6");
                    Glide.with(publikasi.this)
                            .load(gambar6)
                            .into(imageView6);

                    //menampilkan gambar7
                    String gambar7 = jo.getString("pub_gmbr7");
                    Glide.with(publikasi.this)
                            .load(gambar7)
                            .into(imageView7);

                    //menampilkan gambar8
                    String gambar8 = jo.getString("pub_gmbr8");
                    Glide.with(publikasi.this)
                            .load(gambar8)
                            .into(imageView8);

                    //menampilkan gambar9
                    String gambar9 = jo.getString("pub_gmbr9");
                    Glide.with(publikasi.this)
                            .load(gambar9)
                            .into(imageView9);

                    //menampilkan gambar10
                    String gambar10 = jo.getString("pub_gmbr10");
                    Glide.with(publikasi.this)
                            .load(gambar10)
                            .into(imageView10);

                    Toast.makeText(publikasi.this,"Berhasil Memuat Data",Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(publikasi.this,"Gagal Mengambil Api" + error ,Toast.LENGTH_SHORT).show();
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
        Toast.makeText(publikasi.this,"Sedang Mendownload Data...",Toast.LENGTH_SHORT).show();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setVisibleInDownloadsUi(true);
//        request.setDestinationUri(Uri.parse("file://" + folderName + "/myfile.mp3"));

        downloadmanager.enqueue(request);
    }


}