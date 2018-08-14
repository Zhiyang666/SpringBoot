package com.zhiyang.demo1;

import  java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    //第一种映射方法
  /*@Value("${cupSize}")
    private  String cupSize;

    @Value("${age}")
    private  Integer age;

    @Value("${content}")
    private  String content;*/

    //第二种映射方法

    @Autowired
    private  Demo1Properties demo1Properties;

   // @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping("/say")
   // public String say(@PathVariable("id") Integer id){ 要对应起来
    public String say(@RequestParam(value = "id",required = false,defaultValue = "53") Integer id){
        return " id: "+id;
    }

    @GetMapping("/index")
    public String html(){
        return "index.html";
    }



}
