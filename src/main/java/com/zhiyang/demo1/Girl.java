package com.zhiyang.demo1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "girl")
public class Girl {
    @Id
    @GeneratedValue

    @Column(name = "id")
    private  Integer id;

    @Column(name = "name")
    private  String name;

    @Column(name = "cupSize")
    private  String cupSize;

    @Column(name = "age")
    private  Integer age;


}
