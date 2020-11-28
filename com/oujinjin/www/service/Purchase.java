package com.oujinjin.www.service;

import com.oujinjin.www.entity.Goods;

import java.util.ArrayList;
import java.util.Scanner;

public class Purchase {
    public void purchase(ArrayList<Goods> listPro) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(listPro);
            System.out.println("请输入宁要购买的商品编号:");
            Integer i = input.nextInt();
            boolean b = false;//是否修改成功
            b = false;
            for (Goods p : listPro) {
                if (p.getCode() == i) {
                    //p.setCode(Integer.parseInt(input.next()));
                    System.out.println("请输入购买数量:");
                    int count = input.nextInt();
                    if (p.getNum() >= count) {
                        b = true;
                        p.setNum(p.getNum() - count);
                    } else
                        b = false;
                }
            }
            if (!b) {
                System.out.println("购买失败!");
            } else
                System.out.println("购买成功!");
            System.out.println("\n请继续选择您的操作:");
            System.out.println("(1)继续购买 \t(2)退出登陆");
            switch (input.nextInt()) {
                case 1:
                    break;
                case 2:
                    return;
                default:
                    System.out.println("输入错误!");
                    break;
            }
        }
    }
}
