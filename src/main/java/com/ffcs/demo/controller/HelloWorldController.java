package com.ffcs.demo.controller;

import com.ffcs.demo.dao.GoodsInfoDao;
import com.ffcs.demo.domain.GoodsInfo;
import com.ffcs.demo.service.GoodsInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hemb on 2020/8/2.
 */
@RestController
@RequestMapping("test")
public class HelloWorldController {
    @Autowired
    private GoodsInfoService goodsInfoService;

    @GetMapping("/sayHello")
    public  String helloWorld(){
        return "helloWorld";
    }

    @GetMapping("/getAll")
    public List<GoodsInfo>  getAll(){
        List<GoodsInfo> list = goodsInfoService.getGoodsInfoDao().findAll();
        for (GoodsInfo g: list ) {
            System.out.println(g);
        }
        return  list;
    }
}
