package com.zhiyang.demo1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *@GirlRepository
 * 类是使用jpa数据库接口的对Gril对象进行数据库操作
*/
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);

}
