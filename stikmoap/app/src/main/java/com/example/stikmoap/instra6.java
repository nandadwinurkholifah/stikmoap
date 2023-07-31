package com.example.stikmoap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
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

public class instra6 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instra6);

        getSupportActionBar().hide();

        imageView=findViewById(R.id.gambar6);

        tampilgambar();
    }

    private void tampilgambar(){
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
                    String gambar6 = jo.getString("GAMBARkemiskinan");
                    Glide.with(instra6.this)
                            .load(gambar6)
                            .into(imageView);

                    Toast.makeText(instra6.this,"Berhasil Memuat Data",Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(instra6.this,"Gagal Mengambil Api" + error ,Toast.LENGTH_SHORT).show();
            }
        }
        );
        queue.add(stringRequest);

    }
}