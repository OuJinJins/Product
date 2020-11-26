package com.oujinjin.www.service;
import com.java.redpackage.Manager;
import com.oujinjin.www.entity.Num;
import com.oujinjin.www.entity.Product;
import com.oujinjin.www.entity.User;
import com.oujinjin.www.view.View;
import com.oujinjin.www.service.Purchase;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductClient {
    public static void main(String[] args) {
        Num i = new Num();
        ArrayList<Product> listPro = new ArrayList<>();
        ArrayList<User> list = new ArrayList<>();
        Rl rl = new Rl();
        Zsgc zsgc = new Zsgc();
        Purchase purchase = new Purchase();
        boolean back = false;//是否返回上一级

        while(!back) {
            if (rl.rl(list)) {
                System.out.println("管理员登陆成功!");
                zsgc.zsgc(listPro);
                continue;
            }
            else {
                System.out.println("用户登陆成功!");
                purchase.purchase();
                continue;
            }
        }
    }
}
