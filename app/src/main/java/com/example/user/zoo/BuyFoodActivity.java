package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by user on 15/11/2016.
 */

public class BuyFoodActivity extends AppCompatActivity {

    Button mBuyPeanuts;
    Button mBuyMeat;
    Button mBuyGrains;
    Button mBuyBirdFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_food);

        mBuyPeanuts = (Button) findViewById(R.id.buy_peanuts);
        mBuyMeat = (Button) findViewById(R.id.buy_meat);
        mBuyGrains = (Button) findViewById(R.id.buy_grains);
        mBuyBirdFeed = (Button) findViewById(R.id.buy_bird_feed);

    }
}
