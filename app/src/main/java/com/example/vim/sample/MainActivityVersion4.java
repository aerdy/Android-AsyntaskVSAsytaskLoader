package com.example.vim.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;

import com.example.vim.sample.background.MyAsyntaskLoaderVersion4;

/**
 * Created by vim on 04/01/18.
 */

public class MainActivityVersion4 extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String>{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportLoaderManager().initLoader(100,savedInstanceState,this);
    }

    @Override
    public Loader<String> onCreateLoader(int id, Bundle args) {
        return new MyAsyntaskLoaderVersion4(this);
    }

    @Override
    public void onLoadFinished(Loader<String> loader, String data) {

    }

    @Override
    public void onLoaderReset(Loader<String> loader) {

    }
}
