package com.example.controller;

import com.example.eneity.Orderdetail;
import com.example.eneity.Orders;
import com.example.service.OrderdetailService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class OrderDetailController {
    @Resource
    OrderdetailService orderdetailService;

    @GetMapping("/ordersDetail/{id}")
    public String getOrdersDetailById(@PathVariable("id") int oid, Model model){
        Orderdetail orderdetail = new Orderdetail();
        orderdetail.setOid(oid);
        List<Orderdetail> orderdetails = orderdetailService.queryAll(orderdetail);
        model.addAttribute("orderdetails",orderdetails);
        return "ordersDetail";
    }
}
