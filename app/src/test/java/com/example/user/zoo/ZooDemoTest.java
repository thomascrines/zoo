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
    public void testItReturnsStuff() {
        assertEquals("Edinburgh Zoo", zooDemo.zoo.getName());
    }

    @Test
    public void testEnclosureDetails() {
        assertEquals("Something", zooDemo.zoo.viewStockAsString());
    }
}
