package com.example.earthquake_viewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRediff = findViewById(R.id.btnRediff);
       // Button btnCinemaBlend = findViewById(R.id.btnCinemaBlend);
        btnRediff.setOnClickListener(this);
       // btnCinemaBlend.setOnClickListener(this);

//        rssLinks.add("https://aitdgoa.edu.in/feed/");
        rssLinks.add("https://quakes.bgs.ac.uk/feeds/WorldSeismology.xml");
        rssLinks.add("https://www.rediff.com/rss/moviesreviewsrss.xml");
//        rssLinks.add("https://www.cinemablend.com/rss_review.php");
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRediff:

                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink",
                        rssLinks.get(0)));
                break;

          /*  case R.id.btnCinemaBlend:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink",
                        rssLinks.get(1)));
                break;*/
        }
    }
}


