package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class EnclosureActivity extends AppCompatActivity implements View.OnClickListener {

    Button mElephantEnclosure;
    Button mTigerEnclosure;
    Button mSharkTank;
    Button mParrotCage;
    Button mElephantEnclosureInhabitants;
    Button mTigerEnclosureInhabitants;
    Button mSharkTankInhabitants;
    Button mParrotCageInhabitants;
    TextView mElephantEnclosureDetails;
    TextView mTigerEnclosureDetails;
    TextView mSharkTankDetails;
    TextView mParrotCageDetails

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_stock);

        mFoodStockBox = (TextView) findViewById (R.id.food_stock_to_string);

        ZooDemo demoData = new ZooDemo();

        mFoodStockBox.setText(demoData.zoo.viewStockAsString());

    }


}
