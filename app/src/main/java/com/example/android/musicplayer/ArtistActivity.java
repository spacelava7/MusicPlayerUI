package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        LinearLayout coolMusican = (LinearLayout) findViewById(R.id.coolMusican);
        coolMusican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coolMusicianIntent = new Intent(ArtistActivity.this,CoolMusicanActivity.class );
                startActivity(coolMusicianIntent);
            }
        });

        LinearLayout awesomeMusican = (LinearLayout)findViewById(R.id.awesomeMusician);
        awesomeMusican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistActivity.this, "Sorry no info on the Awesome Musician", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
