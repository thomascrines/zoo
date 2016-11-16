package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 15/11/2016.
 */

public class FeedAnimalsActivity extends AppCompatActivity {

    Button mFeedZoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_animals);

        ZooDemo demoData = new ZooDemo();

        mFeedZoo = (Button) findViewById(R.id.feed_zoo);
    }


    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.feed_zoo) {
            ;
        }
    }
}