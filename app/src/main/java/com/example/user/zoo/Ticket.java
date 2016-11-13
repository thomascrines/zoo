package com.example.user.zoo;


/**
 * Created by user on 13/11/2016.
 */

public class Ticket {

    private TicketType ticketType;
    private double price;
    private int numberOfVisitors;

    public Ticket(TicketType ticketType, double price, int numberOfVisitors) {

        this.ticketType = ticketType;
        this.price = price;
        this.numberOfVisitors = numberOfVisitors;
    }

        public TicketType getTicketType() {
            return this.ticketType;
        }

        public double getPrice() {
            return this.price;
        }

        public int getNumberOfVisitors() {
        return this.numberOfVisitors;
    }
    }