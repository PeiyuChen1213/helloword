package com.chenpeiyu.domain;

import lombok.Data;

//使用lombok简化实体类的创建流程
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
