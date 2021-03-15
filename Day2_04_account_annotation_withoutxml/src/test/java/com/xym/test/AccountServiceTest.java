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
import config.SpringConfiguration;
import config.jdbcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit单元测试，测试我们的配置
 */
/*
Spring整合junit的配置
    1、导入spring整合junit的jar（坐标）
    2、使用Junit提供的一个注释把原有的main方法替换了，替换成spring提供的
        @Runwith
    3、告知spring的运行器，spring和IoC创建是基于xml还是注解的，并且说明位置
        @ContextConfiguration
            location：指定xml文件的位置，加上classpath关键字，表示在类路径下
            classes：指定注解类所在的位置

    当使用spring 5.x版本的时候，要求junit的jar必须是4.12及以上
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private AccountService as = null;

//    @Before
//    public void init() {
//        //获取容器
//        ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        //得到业务层对象
//        as = ac.getBean("accountService", AccountService.class);
//    }

    @Test
    public void testFindAll() {
        //执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("xym");
        account.setMoney(12345f);
        //执行方法
        as.saveAccount(account);
    }

    @Test
    public void testUpdate() {
        //执行方法
        Account account = as.findAccountById(5);
        account.setMoney(10000f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {
        //执行方法
        as.deleteAccount(6);
    }

}
