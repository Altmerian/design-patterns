package com.pshakhlovich.designpattern.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class DetailPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************* Detail Report ***********");
        Iterator<Order> iter = orders.iterator();
        double total = 0;
        int i = 1;
        for (var order : orders) {
            double orderTotal = 0;
            System.out.println(i + ". " + order.getId() + " \t" + order.getDate());
            for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("\t\t" + entry.getKey() + "\t" + entry.getValue());
                orderTotal += entry.getValue();
            }
            System.out.println("----------------------------------------");
            System.out.println("\t\t Total  " + orderTotal);
            System.out.println("----------------------------------------");
            total += orderTotal;
            i++;
        }
        System.out.println("----------------------------------------");
        System.out.println("\tGrand Total " + total);
    }
}
