package com.example.internetshopapp;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private final Map<String, Cart> carts;

    public CartService() {
        this.carts = new HashMap<>();
    }

    public void addItemToCart(String sessionId, int itemId) {
        Cart cart = carts.get(sessionId);
        if (cart == null) {
            cart = new Cart();
            carts.put(sessionId, cart);
        }
        cart.addItem(itemId);
    }

    public List<Integer> getItemsInCart(String sessionId) {
        Cart cart = carts.get(sessionId);
        if (cart == null) {
            return new ArrayList<>();
        }
        return cart.getItems();
    }
}

