package com.example.internetshopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/store/order/add")
    public void addItemToCart(@RequestParam String sessionId, @RequestParam int itemId) {
        cartService.addItemToCart(sessionId, itemId);
    }

    @GetMapping("/store/order/get")
    public List<Integer> getItemsInCart(@RequestParam String sessionId) {
        return cartService.getItemsInCart(sessionId);
    }
}
