package com.example.user.zoo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class EnclosureActivity extends AppCompatActivity {

    TextView mEnclosureDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enclosure);

        mEnclosureDetails = (TextView) findViewById (R.id.view_enclosure_to_string);
        mEnclosureDetails.setMovementMethod(new ScrollingMovementMethod());

        ZooDemo demoData = new ZooDemo();

        mEnclosureDetails.setText(demoData.zoo.allEnclosuresDetails());
    }
    }