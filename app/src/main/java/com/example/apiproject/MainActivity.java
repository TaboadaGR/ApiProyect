package com.example.apiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    public TextView textviewget0, textviewget1, textviewget2, textviewget3, textviewget4;
    public ImageView imgget0,imgget1,imgget2,imgget3,imgget4;
    public Button sigIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textviewget0 = findViewById(R.id.txtGET0);
        textviewget1 = findViewById(R.id.txtGET1);
        textviewget2 = findViewById(R.id.txtGET2);
        textviewget3 = findViewById(R.id.txtGET3);
        textviewget4 = findViewById(R.id.txtGET4);

        imgget0 = findViewById(R.id.imgGET0);
        imgget1 = findViewById(R.id.imgGET1);
        imgget2 = findViewById(R.id.imgGET2);
        imgget3 = findViewById(R.id.imgGET3);
        imgget4 = findViewById(R.id.imgGET4);

        sigIn = findViewById(R.id.button);
        methodGET();

        sigIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    public void methodGET () {

        RequestQueue queue = Volley.newRequestQueue(this);

        String url0 = "https://api.coinpaprika.com/v1/coins/btc-bitcoin";
        String url1 = "https://api.coinpaprika.com/v1/coins/eth-ethereum";
        String url2 = "https://api.coinpaprika.com/v1/coins/usdt-tether";
        String url3 = "https://api.coinpaprika.com/v1/coins/usdc-usd-coin";
        String url4 = "https://api.coinpaprika.com/v1/coins/bnb-binance-coin";
        String url5 = "https://api.coinpaprika.com/v1/coins/xrp-xrp";

        String id = "name";


            JsonObjectRequest jsonObjectRequest0 = new JsonObjectRequest(Request.Method.GET, url0, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {

                    try {
                        textviewget0.setText(response.getString(id).toString());
                        Picasso.with(MainActivity.this).load("https://static.coinpaprika.com/coin/btc-bitcoin/logo.png").into(imgget0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                }
            });
            queue.add(jsonObjectRequest0);


    JsonObjectRequest jsonObjectRequest1 = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {

            try {
                textviewget1.setText(response.getString(id).toString());
                Picasso.with(MainActivity.this).load("https://static.coinpaprika.com/coin/eth-ethereum/logo.png").into(imgget1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
        }
    });
            queue.add(jsonObjectRequest1);

    JsonObjectRequest jsonObjectRequest2 = new JsonObjectRequest(Request.Method.GET, url2, null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {

            try {
                textviewget2.setText(response.getString(id).toString());
                Picasso.with(MainActivity.this).load("https://static.coinpaprika.com/coin/usdt-tether/logo.png").into(imgget2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
        }
    });
            queue.add(jsonObjectRequest2);

    JsonObjectRequest jsonObjectRequest3 = new JsonObjectRequest(Request.Method.GET, url3, null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {

                try {
                textviewget3.setText(response.getString(id).toString());
                Picasso.with(MainActivity.this).load("https://static.coinpaprika.com/coin/usdc-usd-coin/logo.png").into(imgget3);
                } catch (JSONException e) {
                e.printStackTrace();
                }
                }
                }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
                }
                });
                queue.add(jsonObjectRequest3);

                JsonObjectRequest jsonObjectRequest4 = new JsonObjectRequest(Request.Method.GET, url4, null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {

                try {
                textviewget4.setText(response.getString(id).toString());
                Picasso.with(MainActivity.this).load("https://static.coinpaprika.com/coin/bnb-binance-coin/logo.png").into(imgget4);
                } catch (JSONException e) {
                e.printStackTrace();
                }
                }
                }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
                }
                });
                queue.add(jsonObjectRequest4);
                }



}






