package com.example.controller;

import com.example.eneity.Adminuser;
import com.example.service.AdminuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginCtrl {
    //@Resource
    @Autowired
    AdminuserService adminuserService;

    @GetMapping("/toLoginPage")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "doLogin",method = RequestMethod.POST)
    //@PostMapping("/doLogin")
    public String doLogin(Adminuser adminuser, Model model, HttpSession session){
       // 用户名 密码进行验证
        List<Adminuser> user =  adminuserService.query(adminuser);
        if(user == null){
            model.addAttribute("msg","用户名或密码不正确");
            return "login";
        }else{
            session.setAttribute("uName",adminuser.getAduname());
            return "redirect:/admin/goods";
        }
    }

    @GetMapping("logout")
    public String doLogout(HttpSession session, SessionStatus sessionStatus){
        // 只是让session失效 但session仍然存在
        session.invalidate();
        sessionStatus.setComplete();
        return "login";
    }

}
