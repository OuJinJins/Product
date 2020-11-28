package com.oujinjin.www.service;

import com.oujinjin.www.entity.Num;
import com.oujinjin.www.entity.User;
import com.oujinjin.www.view.View;
import java.util.ArrayList;
import java.util.Scanner;

public class Rl {
    View view = new View();
    boolean flag;//是否为管理员
    Num i = new Num();


    public boolean rl(ArrayList<User> list) {
        switch (view.rl()) {
            case 1://用户注册
                switch (view.register()){
                    case 1:
                        register(list, true);//管理员注册
                        this.rl(list);
                        return list.get(i.i).flag;//返回是否为管理员
                    case 2:
                        register(list, false);//普通用户注册
                        this.rl(list);
                        return list.get(i.i).flag;//返回是否为管理员
                    default :
                        System.out.println("输入错误!");
                        break;
                }
            case 2://用户登陆
                login(list,i);
                if (list.get(i.i).flag)
                return list.get(i.i).flag;//返回是否为管理员
            default :
                System.out.println("输入错误!");
                break;
        }
        return list.get(i.i).flag;//返回是否为管理员
    }

    public void register(ArrayList<User> list, boolean flag) {
        System.out.println("正在注册……");
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        user.setName(input.next());
        System.out.print("请输入密码：");
        user.setPassword(input.next());

        user.setId(user.getId());
        user.setId(user.getId() + 1);
        user.setFlag(flag); // 是否管理员
        System.out.println();
        list.add(user);
        System.out.println("用户名：" + user.getId() + ",密码：" + user.getPassword());
        list.add(user);
        System.out.println("注册成功！您是第" + user.getId() + "位注册用户");

    }

    public void login(ArrayList<User> list,Num i) {
        System.out.println("正在登录……");
        Scanner input = new Scanner(System.in);
        System.out.print("用户名：");
        String userName = input.next();
        System.out.print("密    码：");
        String password = input.next();

        System.out.println("核对账号密码：" + userName + "  " + password);
        //验证用户名和密码是否有误
        //遍历数组
        for (i.i = 0;i.i < list.size(); i.i++) {
                //此时存在数据，验证用户名和密码是否匹配
                if (userName.equals(list.get(i.i).getName()) && password.equals(list.get(i.i).getPassword())) {
                    System.out.println("验证通过");
                    return;
                }
        }
//		for (int i = 0; i < users.length; i++) {
//			User user = users[i];
//			if (user != null) {
//				//此时存在数据，验证用户名和密码是否匹配
//				if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
//						System.out.println("验证通过");
//						this.welcome();
//						return;//结束本方法
//				}
//			}
//			//数组为空，不执行上面的代码，继续往下执行
//		}

        //如果未能成功匹配，则证明用户名或密码有误，重新登录
        System.out.println("您输入的用户名或密码有误");
        this.rl(list);
        return;
    }

}
