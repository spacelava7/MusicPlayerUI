package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        LinearLayout albumSong = (LinearLayout) findViewById(R.id.album_Song);
        albumSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumSongIntent = new Intent(AlbumActivity.this, NowPlayingActivity.class);
                startActivity(albumSongIntent);
            }
        });

    }
}
