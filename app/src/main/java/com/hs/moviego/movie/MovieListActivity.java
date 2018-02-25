package com.hs.moviego.movie;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.hs.moviego.R;

/**
 * Created by zouhansheng on 2018/2/19.
 */

public class MovieListActivity extends AppCompatActivity {
    MovieListRespository movieListRespository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieListRespository = new MovieListRespository();
        movieListRespository.getMovieListData();
    }
}
