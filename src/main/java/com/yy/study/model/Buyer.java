package com.yy.study.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by zy48461 on 2017/9/1.
 */
public class Buyer {
    @NotBlank(message = "卖家名称不能为空")
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
