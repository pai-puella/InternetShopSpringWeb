package com.example.internetshopapp;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(int itemId) {
        items.add(itemId);
    }

    public List<Integer> getItems() {
        return items;
    }
}
