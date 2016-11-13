package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class TicketTest {

    Ticket standard;
    Ticket concession;
    Ticket threeToFifteen;
    Ticket underThree;
    Ticket family;
    Ticket group;


    @Before
    public void before(){
        standard = new Ticket(TicketType.STANDARD, 17.00, 1);
        concession = new Ticket(TicketType.CONCESSION, 14.50, 1);
        threeToFifteen = new Ticket(TicketType.CHILD_3_TO_15, 12.50, 1);
        underThree = new Ticket(TicketType.CHILD_UNDER_3, 0.00, 1);
        family = new Ticket(TicketType.FAMILY, 53.50, 4);
        group = new Ticket(TicketType.GROUP, 210.00, 15);
    }

    @Test
    public void testCanGetTicketType(){
        assertEquals(TicketType.STANDARD, standard.getTicketType());
    }

    @Test
    public void testCanGetPrice() {
        assertEquals(14.50, concession.getPrice(), 0.1);
    }

    @Test
    public void testCanGetNumberOfVisitors() {
        assertEquals(1, underThree.getNumberOfVisitors());
    }
}
