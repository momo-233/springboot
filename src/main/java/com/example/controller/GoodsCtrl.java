package com.example.controller;

import com.example.eneity.Goods;
import com.example.eneity.Goodstype;
import com.example.service.impl.GoodsServiceImpl;
import com.example.service.impl.GoodstypeServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class GoodsCtrl {
    @Resource
    GoodsServiceImpl goodsService;
    @Resource
    GoodstypeServiceImpl goodstypeService;


    @RequestMapping(value = "/goods",method = {RequestMethod.GET,RequestMethod.POST})
    public String findAllGoods(Model model,
                               @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize",required = false,defaultValue = "4") Integer pageSize){
        PageInfo<Goods> goodsList =  goodsService.queryAll(pageNum,pageSize);
        model.addAttribute("goodsListPage",goodsList);
        return "goodsList";
    }

    @GetMapping("/delGoods/{id}")
    public String delGoods(@PathVariable("id") int id,Model model){
        int num = goodsService.deleteByID(id);
        model.addAttribute("msg","删除成功");
        return "forward:/admin/goods";
    }
    // 通过request对象实现转发
//    @GetMapping("/delGoods/{id}")
//    public void delGoods(@PathVariable("id") int id, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int num = goodsService.deleteById(id);
//        request.setAttribute("msg","删除成功！");
//        request.getRequestDispatcher("/goods").forward(request,response);
//    }

    // 通过ModelAndView对象实现转发
//    @GetMapping("/delGoods/{id}")
//    public ModelAndView delGoods(@PathVariable("id") int id) {
//        int num = goodsService.deleteById(id);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg","删除成功！");
//        modelAndView.setViewName("forward:/goods");
//        return modelAndView;
//    }

    @GetMapping("/goods/{id}")
    public String getGoodsById(@PathVariable("id") int id,Model model){
        Goods goods = goodsService.findById(id);
        ArrayList <Goodstype> list= goodstypeService.query();
        model.addAttribute("goods",goods);
        model.addAttribute("goodstypelist",list);
        return "goodsEdit";
    }

    @PostMapping("/editGoods")
    public String updGoods(Goods goods,Model model){
        int num = goodsService.update(goods);
        model.addAttribute("msg","商品信息更新成功！");
        ArrayList<Goodstype> goodstypesList = goodstypeService.query();
        model.addAttribute("goodstypesList",goodstypesList);
        return "goodsEdit";
    }

    @GetMapping("/toInsertGoods")
    public String toInsertGoods(Model model) {
        ArrayList<Goodstype> goodstypesList = goodstypeService.query();
        model.addAttribute("goodstypesList",goodstypesList);
        return "goodsAdd";
    }

    @PostMapping("/insertGoods")
    public String insertGoods(Goods goods) {
        int i = goodsService.addGoods(goods);
        return "redirect:/admin/goods";
    }

}
