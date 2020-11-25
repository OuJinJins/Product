package com.java.redpackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> arrayList) {
        int index = new Random().nextInt(arrayList.size());
        int delta = arrayList.remove(index);
        int money = super.getMoney();
        setMoney(money + delta);
    }
}
