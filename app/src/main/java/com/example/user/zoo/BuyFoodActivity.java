package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        final ZooDemo demoData = new ZooDemo();

        mBuyPeanuts = (Button) findViewById(R.id.buy_peanuts);
        mBuyMeat = (Button) findViewById(R.id.buy_meat);
        mBuyGrains = (Button) findViewById(R.id.buy_grains);
        mBuyBirdFeed = (Button) findViewById(R.id.buy_bird_feed);


        View.OnClickListener onclick = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int viewId = view.getId();
                if (viewId == R.id.buy_peanuts) {
                    demoData.zoo.getFoodStorage().addFood(new Peanuts(), 1);
                }
                if (viewId == R.id.buy_meat) {
                    demoData.zoo.getFoodStorage().addFood(new Meat(), 1);;
                }
                if (viewId == R.id.buy_grains) {
                    demoData.zoo.getFoodStorage().addFood(new Grains(), 1);;
                }
                if (viewId == R.id.buy_bird_feed) {
                    demoData.zoo.getFoodStorage().addFood(new BirdFeed(), 1);;
                }
            }
        };
        mBuyPeanuts.setOnClickListener(onclick);

    }
}
