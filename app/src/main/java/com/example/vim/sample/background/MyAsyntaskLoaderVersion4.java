package com.example.vim.sample.background;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by vim on 04/01/18.
 */

public class MyAsyntaskLoaderVersion4 extends AsyncTaskLoader<String> {
    public MyAsyntaskLoaderVersion4(Context context) {
        super(context);
    }

    @Override
    public String loadInBackground() {
        return null;
    }
}
