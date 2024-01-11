package org.demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status) {
        // Logging
        // Authentication & Authorization
        // Sanitize the data
        System.out.println("checkout is called..");
    }


    public int quantity () {
        return 111;
    }
}
