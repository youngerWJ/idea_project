package com.younger.domain;

/**
 * Created by younger  2018/12/28
 */
public class Product {
    private String name;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
