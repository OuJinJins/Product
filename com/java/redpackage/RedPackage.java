package com.java.redpackage;

import java.util.ArrayList;

public class RedPackage {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member A = new Member("群员A",0);
        Member B = new Member("群员B",0);

        manager.show();
        A.show();
        B.show();

        ArrayList<Integer> list = manager.send(20,2);

        A.receive(list);
        B.receive(list);

        manager.show();
        A.show();
        B.show();
    }
}
