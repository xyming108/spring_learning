package com.xym.service.impl;

/**
 * @user: Hasee
 * @date: 2021/3/16 9:19
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceImpl
 * Description:
 */

import com.xym.service.AccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新" + i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
