package com.yy.study.main;

import com.yy.study.biz.BussValidator;
import com.yy.study.model.Car;

import java.util.Map;

/**
 * Created by zy48461 on 2017/9/1.
 */
public class MainClass {
    public static void main(String[] args) {
        BussValidator bussValidator = new BussValidator();
        Car car = new Car();
        car.setBrand(" ");
        Map<String, String> errorMessage = bussValidator.valid(car);
        for (Map.Entry<String, String> mess : errorMessage.entrySet()) {
            System.out.println(mess.getKey() + ":" + mess.getValue());
        }
    }
}
