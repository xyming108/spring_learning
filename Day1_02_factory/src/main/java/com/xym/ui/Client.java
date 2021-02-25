package com.xym.ui;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:45
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

import com.xym.factory.BeanFactory;
import com.xym.service.AccountService;

/**
 * 模拟表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
//        AccountService as = new AccountServiceImpl();
        AccountService as = (AccountService) BeanFactory.getBean("accountService");
        as.saveAccount();
    }
}
