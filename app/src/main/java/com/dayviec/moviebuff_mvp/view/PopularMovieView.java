package com.dayviec.moviebuff_mvp.view;


import android.content.Intent;
import android.widget.ImageView;

import com.dayviec.moviebuff_mvp.model.Movie;

import java.util.List;

public interface PopularMovieView {
    void updateSearchView(List<Movie> movies);
    void displayPopularMovies(List<Movie> movies);
    void displayMovieDetailsView(Intent intent,ImageView ivMoviePoster,String transitionName);
}