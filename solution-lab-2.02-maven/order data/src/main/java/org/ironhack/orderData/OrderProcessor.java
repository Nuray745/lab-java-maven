package org.ironhack.orderData;

import com.google.gson.Gson;

public class OrderProcessor {

    public static void main(String[] args) {

        String json = """
        {
          "orderId": "12345",
          "customer": "Nuray",
          "items": [
            {"name": "Laptop", "quantity": 1, "price": 1200.0},
            {"name": "Mouse", "quantity": 2, "price": 25.0}
          ],
          "total": 1250.0
        }
        """;

        Gson gson = new Gson();
        Order order = gson.fromJson(json, Order.class);

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer());

        for (OrderItem item : order.getItems()) {
            System.out.println("Item: " + item.getName() +
                    " | Quantity: " + item.getQuantity() +
                    " | Price: " + item.getPrice());
        }

        System.out.println("Original Total: " + order.getTotal());
    }
}