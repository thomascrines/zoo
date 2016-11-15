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
    TextView mParrotCageDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mElephantEnclosure = (Button) findViewById(R.id.elephant_enclosure);
        mTigerEnclosure = (Button) findViewById(R.id.tiger_enclosure);
        mSharkTank = (Button) findViewById(R.id.shark_tank);
        mParrotCage = (Button) findViewById(R.id.parrot_cage);

        mElephantEnclosureInhabitants = (Button) findViewById(R.id.elephant_enclosure_inhabitants);
        mTigerEnclosureInhabitants = (Button) findViewById(R.id.tiger_enclosure_inhabitants);
        mSharkTankInhabitants = (Button) findViewById(R.id.shark_tank_inhabitants);
        mParrotCageInhabitants = (Button) findViewById(R.id.parrot_cage_inhabitants);

        mElephantEnclosureDetails = (TextView) findViewById(R.id.elephant_enclosure_details);
        mTigerEnclosureDetails = (TextView) findViewById(R.id.tiger_enclosure_details);
        mSharkTankDetails = (TextView) findViewById(R.id.shark_tank_details);
        mParrotCageDetails = (TextView) findViewById(R.id.parrot_cage_details);

        ZooDemo demoData = new ZooDemo();

        mElephantEnclosureDetails.setText(demoData.enclosure1.viewDetailsAsString());
        mTigerEnclosureDetails.setText(demoData.enclosure2.viewDetailsAsString());
        mSharkTankDetails.setText(demoData.enclosure3.viewDetailsAsString());
        mParrotCageDetails.setText(demoData.enclosure4.viewDetailsAsString());

        mElephantEnclosure.setOnClickListener(this);
        mTigerEnclosure.setOnClickListener(this);
        mSharkTank.setOnClickListener(this);
        mParrotCage.setOnClickListener(this);

        mElephantEnclosureInhabitants.setOnClickListener(this);
        mTigerEnclosureInhabitants.setOnClickListener(this);
        mSharkTankInhabitants.setOnClickListener(this);
        mParrotCageInhabitants.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Button button = (Button) view; mElephantEnclosureDetails;

    }
}
