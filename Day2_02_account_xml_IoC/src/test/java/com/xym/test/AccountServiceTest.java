package com.xym.test;

/**
 * @user: Hasee
 * @date: 2021/3/14 13:54
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceTest
 * Description:
 */

import com.xym.domain.Account;
import com.xym.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用junit单元测试，测试我们的配置
 */
public class AccountServiceTest {

    @Test
    public void testFindAll() {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        //执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        //执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("xym");
        account.setMoney(12345f);
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        //执行方法
        as.saveAccount(account);
    }

    @Test
    public void testUpdate() {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        //执行方法
        Account account = as.findAccountById(4);
        account.setMoney(10000f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService", AccountService.class);
        //执行方法
        as.deleteAccount(4);
    }

}
