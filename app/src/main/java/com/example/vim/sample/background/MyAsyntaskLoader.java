package com.example.vim.sample.background;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.SyncHttpClient;

import cz.msebera.android.httpclient.Header;

/**
 * Created by vim on 03/01/18.
 */

public class MyAsyntaskLoader extends AsyncTaskLoader<String> {
    private static final String uri = "http://api.openweathermap.org/data/2.5/group?id=1642911&units=metric&appid=f196731c7ae7c1daf28fc4ab2d5c7a3d";

    public MyAsyntaskLoader(Context context) {
        super(context);
        onContentChanged();
        Log.e("data","init");
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        if (takeContentChanged())
            forceLoad();
    }

    @Override
    protected void onReset() {
        super.onReset();
        onStopLoading();
    }

    @Override
    public String loadInBackground() {
        SyncHttpClient client = new SyncHttpClient();
        client.get(uri, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String result = new String(responseBody);
                Log.e("data", result);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.e("error", error.getMessage());
            }
        });
        return "data";
    }
}
