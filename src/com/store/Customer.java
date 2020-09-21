package com.store;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private BillingInformation billingInformation;
    List<Item> shoppingCart = new ArrayList<>();

}
