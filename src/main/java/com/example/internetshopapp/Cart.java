package com.example.internetshopapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

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
