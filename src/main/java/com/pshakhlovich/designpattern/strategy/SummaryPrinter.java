package com.pshakhlovich.designpattern.strategy;

import java.util.Collection;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*************** Summary Report *************");
        double total = 0;
        int i = 1;
        for (var order : orders) {
            System.out.println(i + ". " + order.getId() + "\t" + order.getDate() + "\t" + order.getItems().size() + "\t" + order.getTotal());
            total += order.getTotal();
            i++;
        }
        System.out.println("*******************************************");
        System.out.println("\t\t\t  Total " + total);
    }


}
