package org.ironhack.orderLogic;

import org.ironhack.orderData.OrderItem;

import java.util.Arrays;
import java.util.List;

public class OrderCalculator {

    public static void main(String[] args) {

        OrderItem item1 = new OrderItem("Laptop", 1, 1200.0);
        OrderItem item2 = new OrderItem("Mouse", 2, 25.0);

        List<OrderItem> items = Arrays.asList(item1, item2);

        double calculatedTotal = 0;

        for (OrderItem item : items) {
            calculatedTotal += item.getQuantity() * item.getPrice();
        }

        System.out.println("Calculated Total: " + calculatedTotal);
    }
}