package com.example.user.zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 16/11/2016.
 */

public class ZooDemoTest {

    ZooDemo zooDemo;

    @Before
    public void before() {

        zooDemo = new ZooDemo();

    }

    @Test
    public void testCanReturnName() {
        assertEquals("Edinburgh Zoo", zooDemo.zoo.getName());
    }

    @Test
    public void testEnclosureDetails() {
        assertEquals("Peanuts: 134\n" +
                "Meat: 120\n" +
                "Grains: 31\n" +
                "Bird Feed: 22", zooDemo.zoo.viewStockAsString());
    }
}
