package com.xym.factory;

import com.xym.service.AccountService;
import com.xym.service.impl.AccountServiceImpl;

/**
 * @user: Hasee
 * @date: 2021/3/12 22:22
 * @author: 1931559710@qq.com
 * ClassName: InstanceFactory
 * Description:
 */

/**
 * 模拟一个工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class StaticFactory {

    public static AccountService getAccountService() {
        return new AccountServiceImpl();
    }

}
