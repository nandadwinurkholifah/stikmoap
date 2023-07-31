package com.example.stikmoap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

import org.json.JSONException;
import org.json.JSONObject;

public class indikator extends AppCompatActivity {
// instra_show instra_show;
    TextView te1, te2, te3, te4, te5, te6, te7, te8, te9, te10, te11, te12, data1, data2, data3, data4, data5, data6, data7,data8, data9,data10,data11,data12;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11,img12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indikator);
        getSupportActionBar().hide();

        te1 = findViewById(R.id.text1);
        te2 = findViewById(R.id.text2);
        te3 = findViewById(R.id.text3);
        te4 = findViewById(R.id.text4);
        te5 = findViewById(R.id.text5);
        te6 = findViewById(R.id.text6);
        te7 = findViewById(R.id.text7);
        te8 = findViewById(R.id.text8);
        te9 = findViewById(R.id.text9);
        te10 = findViewById(R.id.text10);
        te11 = findViewById(R.id.text11);
        te12 = findViewById(R.id.text12);
        data1 = findViewById(R.id.data1);
        data2 = findViewById(R.id.data2);
        data3 = findViewById(R.id.data3);
        data4 = findViewById(R.id.data4);
        data5 = findViewById(R.id.data5);
        data6 = findViewById(R.id.data6);
        data7 = findViewById(R.id.data7);
        data8 = findViewById(R.id.data8);
        data9 = findViewById(R.id.data9);
        data10 = findViewById(R.id.data10);
        data11 = findViewById(R.id.data11);
        data12 = findViewById(R.id.data12);
//        img1 = findViewById(R.id.img1);
//        img2 = findViewById(R.id.img2);
//        img3 = findViewById(R.id.img3);
//        img4 = findViewById(R.id.img4);
//        img5 = findViewById(R.id.img5);
//        img6 = findViewById(R.id.img5);
//        img7 = findViewById(R.id.img7);
//        img7 = findViewById(R.id.img7);
//        img7 = findViewById(R.id.img7);
//        img7 = findViewById(R.id.img7);
//        img7 = findViewById(R.id.img7);
//        img7 = findViewById(R.id.img7);





        tampildata();

//        img1.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//
//                Intent i = new Intent(indikator.this, instra1.class);
//                startActivity(i);
//            }
//        });
//        img2.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//
//                Intent i = new Intent(indikator.this, instra2.class);
//                startActivity(i);
//            }
//        });
    }

    public void satu(View view) {
        Intent i = new Intent(indikator.this, instra1.class);
        startActivity(i);
    }

    public void dua(View view) {
        Intent i = new Intent(indikator.this, instra2.class);
        startActivity(i);
    }

    public void tiga(View view) {
        Intent i = new Intent(indikator.this, instra3.class);
        startActivity(i);
    }

    public void empat(View view) {
        Intent i = new Intent(indikator.this, instra4.class);
        startActivity(i);
    }
    public void lima(View view) {
        Intent i = new Intent(indikator.this, instra5.class);
        startActivity(i);
    }
    public void enam(View view) {
        Intent i = new Intent(indikator.this, instra6.class);
        startActivity(i);
    }
    public void tujuh(View view) {
        Intent i = new Intent(indikator.this, instra7.class);
        startActivity(i);
    }

    public void delapan(View view) {
        Intent i = new Intent(indikator.this, instra8.class);
        startActivity(i);
    }
    public void sembilan(View view) {
        Intent i = new Intent(indikator.this, instra9.class);
        startActivity(i);
    }
    public void sepuluh(View view) {
        Intent i = new Intent(indikator.this, instra10.class);
        startActivity(i);
    }
    public void sebelas(View view) {
        Intent i = new Intent(indikator.this, instra11.class);
        startActivity(i);
    }
    public void duabelas(View view) {
        Intent i = new Intent(indikator.this, instra12.class);
        startActivity(i);
    }


    private void tampildata(){
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://6254d35b89f28cf72b621f26.mockapi.io/api/v1/indikatorstrategis/1";
        JSONObject jsonObject = new JSONObject();
        final String requstBody = jsonObject.toString();

        StringRequest stringRequest = new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jo = new JSONObject(response.toString());
                    String lajupertumbuhan = jo.getString("lajupertumbuhan");
                    String datala = jo.getString("lajupertumbuhanDATA");
                    String indeksgini = jo.getString("indeksgini");
                    String datain = jo.getString("indeksginiDATA");
                    String PDRB = jo.getString("PDRB");
                    String datap = jo.getString("PDRBDATA");
                    String pengangguran = jo.getString("pengangguran");
                    String datape = jo.getString("pengangguranDATA");
                    String partisipasiAK = jo.getString("partisipasiAK");
                    String datapar = jo.getString("partisipasiAKDATA");
                    String kemiskinan = jo.getString("kemiskinan");
                    String datakem = jo.getString("kemiskinanDATA");
                    String pembangunanmanusia = jo.getString("pembangunanmanusia");
                    String datapem = jo.getString("pembangunanmanusiaDATA");
                    String pembangunangender = jo.getString("pembangunangender");
                    String datapemb = jo.getString("pembangunangenderDATA");
                    String harapanhidup = jo.getString("harapanhidup");
                    String datahar = jo.getString("harapanhidupDATA");
                    String harapanlamasekolah = jo.getString("harapanlamasekolah");
                    String datalam = jo.getString("harapanlamasekolahDATA");
                    String ratalamasekolah = jo.getString("ratalamasekolah");
                    String datarat = jo.getString("ratalamasekolahDATA");
                    String pengeluaran = jo.getString("pengeluaran");
                    String datapeng = jo.getString("pengeluaranDATA");

                    te1.setText(lajupertumbuhan);
                    data1.setText(datala);
                    te2.setText(indeksgini);
                    data2.setText(datain);
                    te3.setText(PDRB);
                    data3.setText(datap);
                    te4.setText(pengangguran);
                    data4.setText(datape);
                    te5.setText(partisipasiAK);
                    data5.setText(datapar);
                    te6.setText(kemiskinan);
                    data6.setText(datakem);
                    te7.setText(pembangunanmanusia);
                    data7.setText(datapem);
                    te8.setText(pembangunangender);
                    data8.setText(datapemb);
                    te9.setText(harapanhidup);
                    data9.setText(datahar);
                    te10.setText(harapanlamasekolah);
                    data10.setText(datalam);
                    te11.setText(ratalamasekolah);
                    data11.setText(datarat);
                    te12.setText(pengeluaran);
                    data12.setText(datapeng);

                    Toast.makeText(indikator.this,"Berhasil Memuat Data",Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(indikator.this,"Gagal Mengambil Api" + error ,Toast.LENGTH_SHORT).show();
            }
        }
        );
        queue.add(stringRequest);
    }



//    public void instra1(View view) {
//        Intent i = new Intent(indikator.this, instra_show.class);
//        startActivity(i);
//    }
}