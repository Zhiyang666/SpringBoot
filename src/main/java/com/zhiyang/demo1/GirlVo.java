package com.zhiyang.demo1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GirlVo {
    //@RequestParam("cupSize") String cupSize,
    //@RequestParam("age") Integer age,
    //@RequestParam("name") String name
    /**
     * **
     */
    private String cupSize;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 姓名
     */
    private String name;
}
