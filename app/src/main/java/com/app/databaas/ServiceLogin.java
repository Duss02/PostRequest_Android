package com.app.databaas;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
//
//
// Created by Michele Dussin 20/09/2019
//
//
public class ServiceLogin extends AsyncTask<String, Void, String> {

    ProgressDialog mProgressDialog;
    private String res;

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected String doInBackground(String... params) {
        res = null;
        PutUtility put = new PutUtility();

        put.setParam("Email", params[0].toString());
        put.setParam("Password", params[1].toString());
        put.setParam("Name", params[2].toString());


        try {
            res = put.postData("https://www.youurl.com");
            Log.v("res", res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;

    }

    protected void onPostExecute(String res) {
        //"Here you get response from server in res"

    }
}