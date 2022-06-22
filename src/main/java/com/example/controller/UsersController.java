package com.example.controller;

import com.example.eneity.Users;
import com.example.service.UsersService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@Controller
@RequestMapping("/admin")
public class UsersController {
    @Resource
    UsersService usersService;

    @GetMapping("selectOne")
    public Users selectOne(Integer id) {
        return this.usersService.findById(id);
    }

    @RequestMapping(value = "/users",method = {RequestMethod.GET,RequestMethod.POST})
    public String findAllUsers(Model model,
                               @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize",required = false,defaultValue = "4") Integer pageSize){
        PageInfo<Users> usersList =  usersService.queryAll(pageNum,pageSize);
        model.addAttribute("usersList",usersList);
        System.out.println(usersList);
        return "usersList";
    }

    @GetMapping("/delUsers/{id}")
    public String delUsers(@PathVariable("id") int id, Model model){
        int num = usersService.deleteByID(id);
        model.addAttribute("msg","删除成功");
        return "forward:/admin/users";
    }

    @GetMapping("/users/{id}")
    public String getUsersById(@PathVariable("id") int id,Model model){
        Users users = usersService.findById(id);
        model.addAttribute("users",users);
        return "usersEdit";
    }

    @PostMapping("/editUsers")
    public String updGoods(Users users,Model model){
        int num = usersService.update(users);
        model.addAttribute("msg","用户信息更新成功！");
        return "forward:/admin/users";
    }

    @GetMapping("/toInsertUsers")
    public String toInsertUsers(Model model) {
        return "usersAdd";
    }

    @PostMapping("/insertUsers")
    public String insertGoods(Users users) {
        int i = usersService.addUsers(users);
        return "redirect:/admin/users";
    }
}
