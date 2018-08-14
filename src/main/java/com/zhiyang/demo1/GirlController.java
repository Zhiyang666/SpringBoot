<<<<<<< HEAD
package com.zhiyang.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生的列表
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){

        return girlRepository.findAll();

    }

    /**
     *添加一个女生
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestBody GirlVo girlVo){
        Girl girl=new Girl();
        if(girlVo.getCupSize()!=null) {
            girl.setCupSize(girlVo.getCupSize());
        }
        if(girlVo.getAge()!=null){
            girl.setAge(girlVo.getAge());
        }
        if(girlVo.getName()!=null){
            girl.setName(girlVo.getName());
        }

        return girlRepository.save(girl);
    }

     /**
     * 查询一个女生
     */
    @GetMapping(value = "/girls/{id}")
    public List<Girl> girlFindOne(@PathVariable("id") Integer id){
        List<Girl> list = new ArrayList<>();
        Girl girl = girlRepository.findById(id).get();
        list.add(girl);
        return list;
    }


    /**
     * 更新一个女生
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpDate(@PathVariable("id") Integer id,
                           @RequestBody GirlVo girlVo){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupSize(girlVo.getCupSize());
        girl.setName(girlVo.getName());
        girl.setAge(girlVo.getAge());
        return girlRepository.save(girl);
    }

    /**
     * 删除一个女生
     */
    @DeleteMapping (value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    /**
     * 通过年龄查询
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        List<Girl> list = girlRepository.findByAge(age);
        return list;
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
=======
package com.zhiyang.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生的列表
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){

        return girlRepository.findAll();

    }

    /**
     *添加一个女生
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestBody GirlVo girlVo){
        Girl girl=new Girl();
        if(girlVo.getCupSize()!=null) {
            girl.setCupSize(girlVo.getCupSize());
        }
        if(girlVo.getAge()!=null){
            girl.setAge(girlVo.getAge());
        }
        if(girlVo.getName()!=null){
            girl.setName(girlVo.getName());
        }

        return girlRepository.save(girl);
    }

     /**
     * 查询一个女生
     */
    @GetMapping(value = "/girls/{id}")
    public List<Girl> girlFindOne(@PathVariable("id") Integer id){
        List<Girl> list = new ArrayList<>();
        Girl girl = girlRepository.findById(id).get();
        list.add(girl);
        return list;
    }


    /**
     * 更新一个女生
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpDate(@PathVariable("id") Integer id,
                           @RequestBody GirlVo girlVo){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupSize(girlVo.getCupSize());
        girl.setName(girlVo.getName());
        girl.setAge(girlVo.getAge());
        return girlRepository.save(girl);
    }

    /**
     * 删除一个女生
     */
    @DeleteMapping (value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    /**
     * 通过年龄查询
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        List<Girl> list = girlRepository.findByAge(age);
        return list;
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
>>>>>>> parent of 314708d... 一个springBoot的增删改查demo
