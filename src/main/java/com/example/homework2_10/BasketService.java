package com.example.homework2_10;

import java.util.List;

public class BasketService {
    private Basket basket;


    public BasketService() {
        this.basket = new Basket();
    }
    public void addProducts(List<Integer> products){
        basket.setProductsId(products);
    }

    public String getBasketJSON(){
        return "Корзина с товаром: "+ basket.toString();
    }
}
