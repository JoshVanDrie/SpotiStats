package com.example.spotistats.Pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spotistats.R;

public class Page_Home extends AppCompatActivity implements View.OnClickListener{
    TextView viewMoreArtists;
    TextView viewMoreAlbums;
    TextView viewMoreSongs;
    ImageView artistPic1;
    ImageView artistPic2;
    ImageView artistPic3;
    ImageView albumPic1;
    ImageView albumPic2;
    ImageView albumPic3;
    ImageView songPic1;
    ImageView songPic2;
    ImageView songPic3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViews();
    }

    private void findViews() {
        viewMoreArtists = findViewById(R.id.view_more_artists);
        viewMoreAlbums = findViewById(R.id.view_more_albums);
        viewMoreSongs = findViewById(R.id.view_more_songs);
        artistPic1 = findViewById(R.id.artistPic1);
        artistPic2 = findViewById(R.id.artistPic2);
        artistPic3 = findViewById(R.id.artistPic3);
        albumPic1 = findViewById(R.id.albumPic1);
        albumPic2 = findViewById(R.id.albumPic2);
        albumPic3 = findViewById(R.id.albumPic3);
        songPic1 = findViewById(R.id.songPic1);
        songPic2 = findViewById(R.id.songPic2);
        songPic3 = findViewById(R.id.songPic3);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

        }
    }
}