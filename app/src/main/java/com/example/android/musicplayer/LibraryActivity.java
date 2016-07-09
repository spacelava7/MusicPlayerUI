package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LibraryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        LinearLayout libraryPlaying = (LinearLayout)findViewById(R.id.library_nowPlaying);
        libraryPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryPlayingIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                startActivity(libraryPlayingIntent);
            }
        });

    }

    public void songClicked(View view){
        Toast.makeText(LibraryActivity.this, "You have selected a song", Toast.LENGTH_SHORT).show();

    }

}
