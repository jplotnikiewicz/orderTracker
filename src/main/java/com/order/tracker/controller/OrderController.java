package com.order.tracker.controller;

import com.order.tracker.entities.Order;
import com.order.tracker.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/list")
    public String list(Model model){
        return "";
    }

    @GetMapping("/newOrder")
    public String newOrder(Model model){
        return "";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order")Order order){
        return "";
    }

    @GetMapping("/viewOrder")
    public String viewOrder(@RequestParam("orderId") int orderOd, Model model){
        return "";
    }

    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("orderId") int orderId, Model model){
        return "";
    }


}
