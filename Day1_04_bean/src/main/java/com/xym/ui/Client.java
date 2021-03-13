package com.xym.ui;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:45
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

import com.xym.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层，用于调用业务层
 */
public class Client {
    /**
     * param args
     */
    public static void main(String[] args) {
        //获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println();
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");


        //根据id获取Bean对象
        AccountService as1 = (AccountService) ac.getBean("accountService");
        AccountService as2 = (AccountService) ac.getBean("accountService");

        System.out.println(as1);
        System.out.println(as2);
        as1.saveAccount();

        System.out.println(as1 == as2);

        //手动关闭容器
        ac.close();
    }
}
