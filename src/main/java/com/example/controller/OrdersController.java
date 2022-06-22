package com.example.controller;

import com.example.eneity.Orders;
import com.example.service.OrdersService;
import com.example.service.UsersService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class OrdersController {
    @Resource
    OrdersService ordersService;
    @Resource
    UsersService usersService;

    @RequestMapping(value = "/orders",method = {RequestMethod.GET,RequestMethod.POST})
    public String findAllOrders(Model model,
                               @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize",required = false,defaultValue = "4") Integer pageSize){
        PageInfo<Orders> ordersList =  ordersService.queryAll(pageNum,pageSize);

        model.addAttribute("ordersList",ordersList);
        // System.out.println(ordersList);
        return "ordersList";
    }

    @GetMapping("/delOrders/{id}")
    public String delOrders(@PathVariable("id") int oid, Model model){
        ordersService.deleteById(oid);
        model.addAttribute("msg","删除成功");
        return "forward:/admin/orders";
    }

    @GetMapping("/orders/{id}")
    public String getOrdersById(@PathVariable("id") int oid,Model model){
        Orders orders = ordersService.queryById(oid);
        model.addAttribute("orders",orders);
        return "ordersEdit";
    }

    @PostMapping("/editOrders")
    public String updOrders(Orders orders,Model model){
        ordersService.update(orders);
        model.addAttribute("msg","订单信息更新成功！");
        return "forward:/admin/orders";
    }

    @GetMapping("/toInsertOrders")
    public String toInsertOrders() {
        return "ordersAdd";
    }

    @PostMapping("/insertOrders")
    public String insertOrders(Orders orders) {
        ordersService.insert(orders);
        return "redirect:/admin/orders";
    }

}
