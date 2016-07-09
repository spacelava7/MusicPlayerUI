package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView albumIcon = (ImageView) findViewById(R.id.imageview_album_icon);
        albumIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(NowPlayingActivity.this, AlbumActivity.class );
                startActivity(albumIntent);
            }
        });

        TextView album_text = (TextView) findViewById(R.id.now_playing_album);
        album_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent2 = new Intent(NowPlayingActivity.this, AlbumActivity.class );
                startActivity(albumIntent2);
            }
        });

    }
}
