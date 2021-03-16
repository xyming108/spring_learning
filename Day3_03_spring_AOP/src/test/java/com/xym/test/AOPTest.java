package com.xym.test;

/**
 * @user: Hasee
 * @date: 2021/3/16 21:06
 * @author: 1931559710@qq.com
 * ClassName: AOPTest
 * Description:
 */

import com.xym.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试AOP的配置
 */
public class AOPTest {

    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //执行方法
        as.saveAccount();
        as.updateAccount(1);
        as.deleteAccount();
    }
}
