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

public class instra2 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instra2);
        getSupportActionBar().hide();

        imageView=findViewById(R.id.gambar2);

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
                    String gambar2 = jo.getString("GAMBARindeksgini");

                    Glide.with(instra2.this)
                            .load(gambar2)
                            .into(imageView);

                    Toast.makeText(instra2.this,"Berhasil Memuat Data",Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(instra2.this,"Gagal Mengambil Api" + error ,Toast.LENGTH_SHORT).show();
            }
        }
        );
        queue.add(stringRequest);

    }
}