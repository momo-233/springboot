package com.example.controller;

import com.example.eneity.Goods;
import com.example.eneity.Goodstype;
import com.example.eneity.Users;
import com.example.service.GoodstypeService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class GoodsTypeController {
    @Resource
    GoodstypeService goodstypeService;

    @RequestMapping(value = "/goodstype",method = {RequestMethod.GET,RequestMethod.POST})
    public String findAllgoodstype(Model model,
                               @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize",required = false,defaultValue = "3") Integer pageSize){
        PageInfo<Goodstype> goodstypeList =  goodstypeService.queryAll(pageNum,pageSize);
        model.addAttribute("goodstypeList",goodstypeList);
        return "goodstypeList";
    }

    @GetMapping("/delGoodstype/{id}")
    public String delGoodstype(@PathVariable("id") int id, Model model){
        int num = goodstypeService.deleteById(id);
        model.addAttribute("msg","删除成功");
        return "forward:/admin/goodstype";
    }

    @GetMapping("/goodstype/{id}")
    public String getGoodstypeById(@PathVariable("id") int id,Model model){
        Goodstype goodstype = goodstypeService.queryBytID(id);
        model.addAttribute("goodstype",goodstype);
        return "goodstypeEdit";
    }

    @PostMapping("/editGoodstype")
    public String updGoods(Goodstype goodstype,Model model){
        int num = goodstypeService.update(goodstype);
        model.addAttribute("msg","用户信息更新成功！");
        return "goodstypeEdit";
    }

    @GetMapping("/toInsertGoodstype")
    public String toInsertGoods() {
        return "goodstypeAdd";
    }

    @PostMapping("/insertGoodstype")
    public String insertGoods(Goodstype goodstype) {
        goodstypeService.insert(goodstype);
        return "redirect:/admin/goodstype";
    }
}
