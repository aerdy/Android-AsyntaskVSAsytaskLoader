package com.example.vim.sample;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vim.sample.background.MyAsyntask;
import com.example.vim.sample.background.MyAsyntaskLoader;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getLoaderManager().initLoader(0, savedInstanceState, this);
        new MyAsyntask().execute();
    }

    @Override
    public Loader<String> onCreateLoader(int i, Bundle bundle) {
       return new MyAsyntaskLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<String> loader, String s) {

    }

    @Override
    public void onLoaderReset(Loader<String> loader) {

    }


}
