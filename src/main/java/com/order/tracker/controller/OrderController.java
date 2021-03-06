package com.order.tracker.controller;

import com.order.tracker.entities.Order;
import com.order.tracker.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/list")
    public String list(Model model){

        List<Order> orders = orderService.getOrders();
        model.addAttribute("orders", orders);

        return "list-orders";
    }

    @GetMapping("/newOrder")
    public String newOrder(Model model){
        model.addAttribute("order", new Order());
        return "order-form";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order")Order order){
        orderService.saveOrder(order);

        return "redirect:/order/list";
    }

    @GetMapping("/viewOrder")
    public String viewOrder(@RequestParam("orderId") int orderId, Model model) {

        System.out.println(orderId);
        Order order = orderService.getOrder(orderId);
        System.out.println(order.getCustomer());
        model.addAttribute("order", order);

        return "order-form";
    }

    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("orderId") int orderId, Model model){

        orderService.deleteOrder(orderId);

        return "redirect:/order/list";
    }


}
