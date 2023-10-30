package com.app.databaas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

//
//
// Created by Michele Dussin 20/09/2019
//
//

public class MainActivity extends AppCompatActivity {
    private Button puls;
    private String canetxt , gattotxt,avvotxt,c="d",d="c";
    private EditText cane, gatto, avvo;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puls=(Button)findViewById(R.id.pulsante);
        gatto=(EditText)findViewById(R.id.gatto);
        avvo=(EditText)findViewById(R.id.avvoltoio);
        cane=(EditText)findViewById(R.id.cane);
        puls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                canetxt=cane.getText().toString();
                gattotxt=gatto.getText().toString();
                avvotxt=avvo.getText().toString();
                new ServiceLogin().execute( gattotxt, avvotxt , canetxt);





            }


        });


    }


}
