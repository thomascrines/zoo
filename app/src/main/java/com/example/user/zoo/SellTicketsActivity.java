package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 15/11/2016.
 */

public class SellTicketsActivity extends AppCompatActivity {

    Button mSellStandard;
    Button mSellConcession;
    Button mSellUnderFifteen;
    Button mSellUnderThree;
    Button mSellFamily;
    Button mSellGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_tickets);

//        ZooDemo demoData = new ZooDemo();

        mSellStandard = (Button) findViewById(R.id.sell_standard);
        mSellConcession = (Button) findViewById(R.id.sell_concession);
        mSellUnderFifteen = (Button) findViewById(R.id.sell_under_fifteen);
        mSellUnderThree = (Button) findViewById(R.id.sell_under_three);
        mSellFamily = (Button) findViewById(R.id.sell_family);
        mSellGroup = (Button) findViewById(R.id.sell_group);
    }

    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.sell_standard) {
         
        }
        if (viewId == R.id.sell_concession) {
            ;
        }
        if (viewId == R.id.sell_under_fifteen) {
            ;
        }
        if (viewId == R.id.sell_under_three) {
            ;
        }
        if (viewId == R.id.sell_family) {
            ;
        }
        if (viewId == R.id.sell_group) {
            ;
        }
    }


}
