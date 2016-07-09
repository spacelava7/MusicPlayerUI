package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CoolMusicanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_musican);

        LinearLayout coolAlbum = (LinearLayout) findViewById(R.id.coolAlbum);
        coolAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coolAlbumIntent = new Intent(CoolMusicanActivity.this, AlbumActivity.class);
                startActivity(coolAlbumIntent);
            }
        });
    }
}
