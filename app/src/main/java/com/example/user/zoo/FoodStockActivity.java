package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class FoodStockActivity extends AppCompatActivity {

    TextView mFoodStockBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_stock);

    mFoodStockBox = (TextView) findViewById (R.id.food_stock_to_string);

    ZooDemo demoData = new ZooDemo();

    mFoodStockBox.setText(demoData.zoo.viewStockAsString());

}
}
