package com.example.homework2_10;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketController {
    private BasketService basketService;


    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping(path = "/add")
    public String addProduct(@RequestParam("id") List<Integer> products){
        basketService.addProducts(products);
        return "Добавлен " + products.toString();

    }
    @GetMapping(path = "/get")
    public String getBasket3Products(){
        return basketService.getBasketJSON();
    }
}
