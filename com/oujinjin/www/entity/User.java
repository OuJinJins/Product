package com.oujinjin.www.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    static  int id = 0;
    private String name;
    private String password;
    private int money;
    shoppingCart;
    public boolean flag = false;//ture 管理员 /false 普通用户

    /*
    public static boolean login(ArrayList<User> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        int id = scanner.nextInt();
        int i = 0;
        for(;i<list.size();i++){
            if(list.get(i).id == id){
                return true;
            }
        }
        return false;
    }

    public static boolean register(ArrayList<User> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
    int id = scanner.nextInt();
    //是否之前存在id,存在，注册失败
        for(int i=0;i<list.size();i++){
        if(list.get(i).id == id){
            return false;
        }
    }

        for(int i=0;i<list.size();i++){
        if(list.get(i).id == 0){
            list.get(i).id = id;//找到合适位置放id
            return true;
        }
    }
        return false;
}
*/

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isFlag() {
        return flag;
    }

    public User(String name, String password, boolean flag) {
        this.name = name;
        this.password = password;
        this.flag = flag;
    }

    public User() {
    }
}
