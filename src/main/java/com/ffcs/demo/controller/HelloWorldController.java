package com.ffcs.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.ffcs.demo.domain.GoodsInfo;
import com.ffcs.demo.service.GoodsInfoService;
import com.ffcs.demo.utils.PicUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.Date;

/**
 * Created by hemb on 2020/8/2.
 */
@CrossOrigin
@RestController
@RequestMapping("api/helloWorld")
public class HelloWorldController {

    @CrossOrigin(origins = "*",allowCredentials = "true")
    @GetMapping("/sayHello")
    public  String helloWorld(){
        return "helloWorld";
    }
}
