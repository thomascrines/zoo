package com.example.user.zoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class SellTicketsActivity extends AppCompatActivity {

    TextView mZooCapacityBox;
    TextView mZooFundsBox;
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
        mZooCapacityBox = (TextView) findViewById(R.id.zoo_capacity);
        mZooFundsBox = (TextView) findViewById(R.id.zoo_funds);
        mSellStandard = (Button) findViewById(R.id.sell_standard);
        mSellConcession = (Button) findViewById(R.id.sell_concession);
        mSellUnderFifteen = (Button) findViewById(R.id.sell_under_fifteen);
        mSellUnderThree = (Button) findViewById(R.id.sell_under_three);
        mSellFamily = (Button) findViewById(R.id.sell_family);
        mSellGroup = (Button) findViewById(R.id.sell_group);

        final ZooDemo demoData = new ZooDemo();

        final Ticket standard = new Ticket(TicketType.STANDARD, 17.00, 1);
        final Ticket concession = new Ticket(TicketType.CONCESSION, 14.50, 1);
        final Ticket threeToFifteen = new Ticket(TicketType.CHILD_3_TO_15, 12.50, 1);
        final Ticket underThree = new Ticket(TicketType.CHILD_UNDER_3, 0.00, 1);
        final Ticket family = new Ticket(TicketType.FAMILY, 53.50, 4);
        final Ticket group = new Ticket(TicketType.GROUP, 210.00, 15);

        mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
        mZooFundsBox.setText(demoData.zoo.getFundsToString());

        View.OnClickListener onclick = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int viewId = view.getId();
                if (viewId == R.id.sell_standard) {
                    demoData.zoo.sellTickets(standard, 1);
                    mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());
                }
                if (viewId == R.id.sell_concession) {
                    demoData.zoo.sellTickets(concession, 1);
                    mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());

                }
                if (viewId == R.id.sell_under_fifteen) {
                    demoData.zoo.sellTickets(threeToFifteen, 1);
                    mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());

                }
                if (viewId == R.id.sell_under_three) {
                    demoData.zoo.sellTickets(underThree, 1);
                    mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());

                }
                if (viewId == R.id.sell_family) {
                    demoData.zoo.sellTickets(family, 1);
                    mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());

                }
                if (viewId == R.id.sell_group) {
                    demoData.zoo.sellTickets(group, 1);
                    mZooCapacityBox.setText(demoData.zoo.getCapacityToString());
                    mZooFundsBox.setText(demoData.zoo.getFundsToString());

                }
            }
        };
        mSellStandard.setOnClickListener(onclick);
        mSellConcession.setOnClickListener(onclick);
        mSellUnderFifteen.setOnClickListener(onclick);
        mSellUnderThree.setOnClickListener(onclick);
        mSellFamily.setOnClickListener(onclick);
        mSellGroup.setOnClickListener(onclick);
    }
}