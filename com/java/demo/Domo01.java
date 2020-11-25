package com.java.demo;

public class Domo01 {

    public static void main(String[] args){
        Hero hero = new Hero();
        hero.setName("黄月英");
        hero.setAge(16);

        Weapon weapon = new Weapon("木牛流马");

        hero.setWeapon(weapon);

        hero.attack();
    }
}
