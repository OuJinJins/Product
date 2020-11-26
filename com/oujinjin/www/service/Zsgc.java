package com.oujinjin.www.service;

import com.oujinjin.www.entity.Product;
import com.oujinjin.www.entity.User;
import com.oujinjin.www.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zsgc {
    Scanner input = new Scanner(System.in);
    View view = new View();

    public void zsgc(ArrayList<Product> listPro) {
        while (true) {
            switch (view.zsgc()) {
                case 1:
                    add(listPro);
                    break;
                case 2:
                    del(listPro);
                    break;
                case 3:
                    mod(listPro);
                    break;
                case 4:
                    searchOne(listPro);
                    break;
                case 5:
                    searchAll(listPro);
                    break;
                case 6:
                    return;//退出登陆
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }
    }

    public void add(ArrayList<Product> listPro) {
        //循环添加
        while (true) {
            Product p = new Product();
            p.setCode(p.getCode());
            p.setCode(p.getCode() + 1);
            System.out.println("请输入商品名称：");
            String name = input.next();
            p.setName(name);

            System.out.println("请输入商品价格：");
            double price = input.nextDouble();
            p.setPrice(price);

            System.out.println("请输入商品数量：");
            int count = input.nextInt();
            p.setNum(count);
            //将添加的数据存到list中
            listPro.add(p);
            System.out.println("添加成功！\n请继续选择您的操作：");
            System.out.println("1、继续添加。\t2、返回主界面");
            switch (input.nextInt()) {
                //跳出本循环，继续执行添加操作
                case 1:
                    break;
                //跳出本方法，返回index()函数
                case 2:
                    return;
                default:
                    System.out.println("输入错误！");
                    break;
            }

        }
    }

    public void del(ArrayList<Product> listPro) {
        while (true) {
            System.out.println("请输入您要删除的商品Code：");
            Integer i = input.nextInt();
            boolean b = false;//是否删除成功
            //循环遍历删除
            for (int j = 0; j < listPro.size(); j++) {
                if (listPro.get(j).getCode() == i) {
                    //如果找到就删除此元素的下标
                    listPro.remove(j);
                    b = true;
                } //删除失败

                for (j = 0; j < listPro.size(); j++) {
                    listPro.get(j).setCode(j);
                }
                if (!b) {
                    System.out.print("商品编号不存在!");
                } else
                    System.out.print("删除成功!");
                System.out.println("\n请继续选择您的操作:");
                System.out.println("1、继续添加。\t2、返回主界面");
                switch (input.nextInt()) {
                    case 1:
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("输入错误！");
                        break;
                }
            }
        }
    }

    public void mod(ArrayList<Product> listPro){
        //循环遍历修改
        while (true) {
            System.out.println("请输入您要修改的商品编号:");
            Integer i = input.nextInt();
            boolean b = false;//是否修改成功
            b = false;
            for (Product p : listPro) {
                if (p.getCode() == i) {
                    System.out.println("请输入商品编号:");
                    p.setCode(Integer.parseInt(input.next()));

                    System.out.println("请输入商品名称:");
                    String name = input.next();
                    p.setName(name);

                    System.out.println("请输入商品价格:");
                    double price = input.nextDouble();
                    p.setPrice(price);

                    System.out.println("请输入商品库存:");
                    int count = input.nextInt();
                    p.setNum(count);
                    b = true;
                }
            }if (!b) {
                System.out.println("商品编号不存在!");
            } else
                System.out.println("修改成功!");
            System.out.println("\n请继续选择您的操作:");
            System.out.println("1、继续修改 \t2、返回主界面");
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

    //查找单个商品
    public void searchOne(ArrayList<Product> listPro){
        System.out.println("请输入您要查找的商品编号：");
        Integer i = input.nextInt();
        boolean b = false;
        for (Product p : listPro) {
            if (p.getCode() == i) {
                b=true;
                System.out.println(p);
            }
        }
        if (!b) {
            System.out.println("您输入的商品编号不存在！");
        }
        System.out.println("请继续选择您的操作：");
        System.out.println("(1)继续查找");
        System.out.println("(2)返回主界面");
        switch(input.nextInt()){
            case 1:
                break;
            case 2:
                return;
            default :
                System.out.println("输入错误!");
                break;
        }

    }

    public void searchAll(ArrayList<Product> listPro){
        while(true) {
            System.out.println(listPro);
            System.out.println("遍历成功！\n请继续选择您的操作：");
            System.out.println("(1)再次遍历");
            System.out.println("(2)返回主界面");
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