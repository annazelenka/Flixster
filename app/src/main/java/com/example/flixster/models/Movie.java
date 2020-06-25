package com.example.flixster.models;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Parcel //annotation indicates the class is Parcelable
public class Movie {

    String backdropPath;
    String posterPath;
    String title;
    String overview;
    Double voteAverage;
    Boolean isAdultMovie;
    String originalLanguage;

    Map<String, String> languageAbbreviationMap;

    //default constructor required for Parceler
    public Movie() {}

    public Movie(JSONObject jsonObject) throws JSONException {
        languageAbbreviationMap = new HashMap<String,String>() {{
            put("es", "Spanish");
            put("en", "English");
            put("sv", "Swedish");
            put("fr", "French");
        }};


        backdropPath = jsonObject.getString("backdrop_path");
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
        voteAverage = jsonObject.getDouble("vote_average"); //instead of movie.getDouble
        isAdultMovie = jsonObject.getBoolean("adult");
        originalLanguage = languageAbbreviationMap.get(jsonObject.getString("original_language"));
    }

    public static List<Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < movieJsonArray.length(); i++) {
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));

        }
        return movies;
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", backdropPath);
    }

    public String getPosterPath() {
        //replace %s w/ posterPath; hardcode width to 342
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath);
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public Boolean getAdultMovie() {
        return isAdultMovie;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }
}
