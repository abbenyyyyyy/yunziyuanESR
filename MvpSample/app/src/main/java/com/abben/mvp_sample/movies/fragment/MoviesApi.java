package com.abben.mvp_sample.movies.fragment;

import com.abben.mvp_sample.bean.Movie;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by abben on 2017/5/8.
 */

public interface MoviesApi {

    @GET("{type}.json")
    Observable<ArrayList<Movie>> fetchMovies(@Path("type") String type);

}
