package com.oujinjin.www.service;
import com.oujinjin.www.entity.Num;
import com.oujinjin.www.entity.Goods;
import com.oujinjin.www.entity.User;

import java.util.ArrayList;

public class ProductClient {
    public static void main(String[] args) {
        Num i = new Num();
        ArrayList<Goods> listPro = new ArrayList<>();
        ArrayList<User> list = new ArrayList<>();
        Rl rl = new Rl();
        Crud crud = new Crud();
        Purchase purchase = new Purchase();
        boolean back = false;//是否返回上一级

        while(!back) {
            if (rl.rl(list)) {
                System.out.println("管理员登陆成功!");
                crud.zsgc(listPro);
                continue;
            }
            else {
                System.out.println("用户登陆成功!");
                purchase.purchase(listPro);
                continue;
            }
        }
    }
}
