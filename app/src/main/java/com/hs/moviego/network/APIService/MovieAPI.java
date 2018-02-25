package com.hs.moviego.network.APIService;

import com.hs.moviego.MovieListObject;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by zouhansheng on 2018/2/21.
 */

public interface MovieAPI {

    @GET("all-mv")
    Observable<List<MovieListObject>> allMovieStr(

    );

    @GET("thInfo")
    Observable<String> getTheaterInfoStr(
            @Query("id")
                    String id
    );


    @GET("mvInfo")
    Observable<String> getMvInfoStr(
            @Query("id")
                    String id
    );
}
