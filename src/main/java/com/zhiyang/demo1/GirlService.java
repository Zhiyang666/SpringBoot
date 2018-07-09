package com.zhiyang.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setCupSize("F");
        girlA.setAge(19);
        girlA.setName("本课程");
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setCupSize("D");
        girlB.setAge(39);
        girlB.setName("卡萨丁");
        girlRepository.save(girlB);
    }
}
