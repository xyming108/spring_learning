package com.xym.service.impl;

import com.xym.dao.AccountDao;
import com.xym.factory.BeanFactory;
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

    //    private AccountDao accountDao = new AccountDaoImpl();
    private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
