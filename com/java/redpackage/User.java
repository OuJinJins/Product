package com.java.redpackage;

public class User {

    private  String name;//name
    private  int Money;//Money

    public User(String name, int money) {
        this.name = name;
        Money = money;
    }

    public void show() {
        System.out.println("我叫" + name + "我有" + Money);
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return Money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        Money = money;
    }
}
