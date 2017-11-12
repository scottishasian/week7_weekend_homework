package com.example.kynansong.zoo;

/**
 * Created by kynansong on 12/11/2017.
 */

public class Visitor {

    String name;
    double cash;
    int ticket;

    public Visitor(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.ticket = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCash() {
        return this.cash;
    }

    public void canBuyTicket(double ticketPrice) {
        this.cash -= ticketPrice;
        this.ticket += 1;

    }

    public int ticketCount() {
        return this.ticket;
    }
}
