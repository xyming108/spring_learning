package com.xym.service.impl;

import com.xym.dao.AccountDao;
import com.xym.dao.impl.AccountDaoImpl;
import com.xym.service.AccountService;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:39
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceImpl
 * Description:
 */

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
