package com.oujinjin.www.service;
import com.java.redpackage.Manager;
import com.oujinjin.www.entity.User;
import com.oujinjin.www.view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductClient {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Rl rl = new Rl();
        if (rl.rl(list)) {
            System.out.println("管理员登陆成功!");

        }
        else{
            System.out.println("用户登陆成功!");

        }
    }
}
