package com.yy.study.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by zy48461 on 2017/9/1.
 */
public class Car {

    @NotBlank(message = "品牌不能为空")
    @Pattern(regexp = "DZ|BMW|BENZ", message = "品牌介于这三个品牌之间")
    private String       brand;

    private Integer          wleel;

    @NotBlank(message = "零件供应商不能为空")
    @Size(min = 5,max = 10,message = "供应商最小5个最多10个")
    private List<Object> lstPrivade;

    @NotNull(message = "买家不能为空")
    private Buyer buyer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getWleel() {
        return wleel;
    }

    public void setWleel(Integer wleel) {
        this.wleel = wleel;
    }

    public List<Object> getLstPrivade() {
        return lstPrivade;
    }

    public void setLstPrivade(List<Object> lstPrivade) {
        this.lstPrivade = lstPrivade;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
