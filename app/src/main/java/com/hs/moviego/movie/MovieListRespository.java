package com.hs.moviego.movie;

import android.arch.lifecycle.MutableLiveData;
import android.content.ContentValues;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hs.moviego.MovieListObject;
import com.hs.moviego.R;
import com.hs.moviego.network.APIService.MovieAPI;
import com.hs.moviego.network.NetworkService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by zouhansheng on 2018/2/19.
 */

public class MovieListRespository {

    public MutableLiveData<JSONArray> getMovieListData() {
        final MutableLiveData<JSONArray> movieListDataResponseMutableLiveData = new MutableLiveData<>();

        MovieAPI movieAPI = NetworkService.createService(MovieAPI.class);

        Observable<List<MovieListObject>> call = movieAPI.allMovieStr();
        call.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<MovieListObject>>() {
                    @Override
                    public void call(List<MovieListObject> movieListObjects) {
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        String  g = gson.toJson(movieListObjects);
                        Log.e("TAG", g);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("TAG", throwable.toString());
                    }
                });


        return movieListDataResponseMutableLiveData;
    }
}
