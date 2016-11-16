package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class FeedAnimalsActivity extends AppCompatActivity {

    TextView mFoodStockBox;
    Button mFeedZoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_animals);

        mFoodStockBox = (TextView) findViewById(R.id.food_stock_to_string);

        final ZooDemo demoData = new ZooDemo();

        mFoodStockBox.setText(demoData.zoo.viewStockAsString());

        mFeedZoo = (Button) findViewById(R.id.feed_zoo);

        View.OnClickListener onclick = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int viewId = view.getId();
                if (viewId == R.id.feed_zoo) {
                    demoData.zoo.addNecessaryFoodForDay();
                    demoData.zoo.removeFoodFromStore();
                    mFoodStockBox.setText(demoData.zoo.viewStockAsString());
                }
            }
        };
        mFeedZoo.setOnClickListener(onclick);
    }
}