package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class MainActivity extends AppCompatActivity {

    TextView mZooTitleBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mZooTitleBox = (TextView) findViewById (R.id.zoo_name);

        ZooDemo demoData = new ZooDemo();

        mZooTitleBox.setText(demoData.zoo.getName());
    }

}
