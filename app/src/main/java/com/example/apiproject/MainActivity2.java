package com.example.apiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    EditText txtname,txtuser,txtemail,txtpassw;
    Button btn;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtname = findViewById(R.id.editTextName);
        txtuser = findViewById(R.id.editTextUserName);
        txtemail = findViewById(R.id.editTextEmail);
        txtpassw = findViewById(R.id.editTextPassword);

        btn = findViewById(R.id.button2);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button2) {

            String url = "https://jsonplaceholder.typicode.com/Posts";
            StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                    response -> Toast.makeText(MainActivity2.this, "Success", Toast.LENGTH_LONG).show(),
                    error -> Toast.makeText(MainActivity2.this, "Error", Toast.LENGTH_LONG).show()){

                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<>();
                    params.put("name", txtname.getText().toString());
                    params.put("user", txtuser.getText().toString());
                    return params;
                }
            };
            requestQueue = Volley.newRequestQueue(MainActivity2.this);
            requestQueue.add(stringRequest);
        }
    }
}