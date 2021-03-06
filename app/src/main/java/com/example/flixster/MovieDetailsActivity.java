package com.example.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixster.models.Movie;

import org.parceler.Parcels;

public class MovieDetailsActivity extends AppCompatActivity {
    //movie to display
    Movie movie;

    //the view objects
    TextView tvTitle;
    TextView tvOverview;
    TextView tvFamilyFriendly;
    TextView tvLanguage;
    TextView tvPopularity;
    RatingBar rbVoteAverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        //resolve the view objects
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvOverview = (TextView) findViewById(R.id.tvOverview);
        rbVoteAverage = (RatingBar) findViewById(R.id.rbVoteAverage);
        tvFamilyFriendly = (TextView) findViewById(R.id.tvFamilyFriendly);
        tvLanguage = (TextView) findViewById(R.id.tvLanguage);
        tvPopularity = (TextView) findViewById(R.id.tvPopularity);

        // unwrap the movie passed in via intent, using its simple name as a key
        movie = (Movie) Parcels.unwrap(getIntent().getParcelableExtra(Movie.class.getSimpleName()));
        Log.d("MovieDetailsActivity", String.format("Showing details for '%s'", movie.getTitle()));

        // set the title, overview, language, and family friendly text views
        tvTitle.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());
        String tvFamilyFriendlyText = movie.getAdultMovie() ? "NOT Family-Friendly" : "Family-Friendly";
        tvFamilyFriendly.setText(tvFamilyFriendlyText);
        tvLanguage.setText(movie.getOriginalLanguage());
        tvPopularity.setText("Popularity: " + movie.getPopularity());

        // vote average is 0..10, convert to 0..5 by dividing by 2
        float voteAverage = movie.getVoteAverage().floatValue();
        rbVoteAverage.setRating(voteAverage = voteAverage > 0 ? voteAverage / 2.0f : voteAverage);


    }
}