package com.example.controller;


import com.example.eneity.Adminuser;
import com.example.service.AdminuserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin")
public class AdminuserController {
    @Resource
    AdminuserService adminuserService;

    @RequestMapping(value = "/adminuser",method = {RequestMethod.GET,RequestMethod.POST})
    public String findAllAdminuser(Model model,
                                @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize",required = false,defaultValue = "4") Integer pageSize){
        PageInfo<Adminuser> adminuserList =  adminuserService.queryAll(pageNum,pageSize);

        model.addAttribute("adminuserList",adminuserList);

        return "adminuserList";
    }

    @GetMapping("/delAdminuser/{id}")
    public String delAdminuser(@PathVariable("id") int aduid, Model model){
        adminuserService.deleteById(aduid);
        model.addAttribute("msg","删除成功");
        return "forward:/admin/adminuser";
    }

    @GetMapping("/adminuser/{id}")
    public String getAdminuserById(@PathVariable("id") int aduid,Model model){
        Adminuser adminuser = adminuserService.queryById(aduid);
        model.addAttribute("adminuser",adminuser);
        return "adminuserEdit";
    }

    @PostMapping("/editAdminuser")
    public String updAdminuser(Adminuser adminuser,Model model){
        System.out.println(adminuserService.update(adminuser));
        model.addAttribute("msg","管理员信息更新成功！");
        return "adminuserEdit";
    }

    @GetMapping("/toInsertAdminuser")
    public String toInsertAdminuser() {
        return "adminuserAdd";
    }

    @PostMapping("/insertAdminuser")
    public String insertAdminuser(Adminuser adminuser) {
        adminuserService.insert(adminuser);
        return "redirect:/admin/adminuser";
    }

}
