package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class BuyFoodActivity extends AppCompatActivity {

    TextView mZooFundsBox;
    TextView mFoodStockBox;
    Button mBuyPeanuts;
    Button mBuyMeat;
    Button mBuyGrains;
    Button mBuyBirdFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_food);

        mZooFundsBox = (TextView) findViewById(R.id.zoo_funds);
        mFoodStockBox = (TextView) findViewById (R.id.food_stock_to_string);
        mBuyPeanuts = (Button) findViewById(R.id.buy_peanuts);
        mBuyMeat = (Button) findViewById(R.id.buy_meat);
        mBuyGrains = (Button) findViewById(R.id.buy_grains);
        mBuyBirdFeed = (Button) findViewById(R.id.buy_bird_feed);

        final ZooDemo demoData = new ZooDemo();
        final Peanuts peanuts = new Peanuts();
        final Meat meat = new Meat();
        final Grains grains = new Grains();
        final BirdFeed birdFeed = new BirdFeed();

        mFoodStockBox.setText(demoData.zoo.viewStockAsString());
        mZooFundsBox.setText(demoData.zoo.getFundsToString());

        View.OnClickListener onclick = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int viewId = view.getId();
                if (viewId == R.id.buy_peanuts) {
                    demoData.zoo.buyFood(peanuts, 1);
                    mFoodStockBox.setText(demoData.zoo.viewStockAsString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());
                }
                if (viewId == R.id.buy_meat) {
                    demoData.zoo.buyFood(meat, 1);
                    mFoodStockBox.setText(demoData.zoo.viewStockAsString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());
                }
                if (viewId == R.id.buy_grains) {
                    demoData.zoo.buyFood(grains, 1);
                    mFoodStockBox.setText(demoData.zoo.viewStockAsString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());
                }
                if (viewId == R.id.buy_bird_feed) {
                    demoData.zoo.buyFood(birdFeed, 1);
                    mFoodStockBox.setText(demoData.zoo.viewStockAsString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());
                }
            }
        };
        mBuyPeanuts.setOnClickListener(onclick);
        mBuyMeat.setOnClickListener(onclick);
        mBuyGrains.setOnClickListener(onclick);
        mBuyBirdFeed.setOnClickListener(onclick);

    }
}
