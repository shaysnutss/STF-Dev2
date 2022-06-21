package com.harrysoft.androidbluetoothserial.demoapp;

import android.os.AsyncTask;
import android.util.Log;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Callapi extends AsyncTask<String, String, String> {
    String emailString;


    public Callapi(String email){
        emailString = email;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        Log.d("akshaya", "inside1");
        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("email", emailString) // A sample POST field
                .build();
        Log.d("akshaya", "inside2");
        Request request = new Request.Builder()
                .url("http://ec2-54-169-121-229.ap-southeast-1.compute.amazonaws.com:11010/main") // The URL to send the data to
                .post(formBody)
                .build();
        Log.d("akshaya", "inside3");
        return "";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

}
