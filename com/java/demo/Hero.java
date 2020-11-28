package com.java.demo;

public class Hero {

    private String name;
    private Weapon weapon;
    private  int age;

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "用" + weapon.getCode() + "攻击敌方");
    }
    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
