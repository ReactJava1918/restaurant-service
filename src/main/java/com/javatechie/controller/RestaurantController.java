package com.javatechie.controller;

import com.javatechie.dto.OrderResponseDTO;
import com.javatechie.service.RestaurantService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @Autowired
    private HttpServletRequest request;

    @GetMapping
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/orders/status/{orderId}")
    public OrderResponseDTO getOrder(@PathVariable String orderId) {
        return service.getOrder(orderId);
    }

    @GetMapping("/hotels")
    public List<String> greetingHotels() {
        return Arrays.asList("HOtel Taz", "Hotel Bawarchi!", "Hotel alpha","siva Hotel");

    }

}
