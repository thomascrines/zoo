package com.example.user.zoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mZooTitleBox;
    TextView mZooCapacityBox;
    TextView mZooFundsBox;
    Button mViewEnclosures;
    Button mViewFoodStock;
    Button mBuyFood;
    Button mFeedAnimals;
    Button mSellTickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mZooTitleBox = (TextView) findViewById (R.id.zoo_name);
        mZooCapacityBox = (TextView) findViewById (R.id.zoo_capacity);
        mZooFundsBox = (TextView) findViewById(R.id.zoo_funds);
        mViewEnclosures = (Button) findViewById(R.id.enclosures);
        mViewFoodStock = (Button) findViewById(R.id.food_stock);
        mBuyFood = (Button) findViewById(R.id.buy_food);
        mFeedAnimals = (Button) findViewById(R.id.feed_animals);
        mSellTickets = (Button) findViewById(R.id.sell_tickets);

        ZooDemo demoData = new ZooDemo();

        mZooTitleBox.setText(demoData.zoo.getName());
        mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
        mZooFundsBox.setText(demoData.zoo.getFundsToString());

        mViewEnclosures.setOnClickListener(this);
        mViewFoodStock.setOnClickListener(this);
        mBuyFood.setOnClickListener(this);
        mFeedAnimals.setOnClickListener(this);
        mSellTickets.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        Intent intent = null;
        if (viewId == R.id.enclosures) {
            intent = new Intent(this, EnclosureActivity.class);
        }
        if (viewId == R.id.food_stock) {
            intent = new Intent(this, FoodStockActivity.class);
        }
        if (viewId == R.id.buy_food) {
            intent = new Intent(this, BuyFoodActivity.class);
        }
        if (viewId == R.id.feed_animals) {
            intent = new Intent(this, FeedAnimalsActivity.class);
        }
        if (viewId == R.id.sell_tickets) {
            intent = new Intent(this, SellTicketsActivity.class);
        }
        startActivity(intent);
    }
}

