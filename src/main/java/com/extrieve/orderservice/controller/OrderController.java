package com.extrieve.orderservice.controller;

import com.extrieve.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public String orderPlaced(@RequestBody OrderRequest orderRequest){
        return "Order Placed Successfully";
    }
}
