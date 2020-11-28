package com.oujinjin.www.entity;

public class Goods {
    //商品名称
    private String name;
    //商品编号
    private  int code = -1;
    //商品价格
    private double price;
    //商品数量
    private int num;

    //构造
    public Goods(String name, int code, double price, int num) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.num = num;

    }

    public Goods() {
    }

    //getter&setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    //重写 toString方法
    @Override
    public String toString() {
        return "\nGoodsCode:"+ this.code +" [名称：" + name + "]" + " [价格：" + price + "]" + " [数量：" + num + "]" + "\n";
    }

}
