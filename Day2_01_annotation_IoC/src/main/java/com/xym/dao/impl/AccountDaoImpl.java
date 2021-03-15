package com.xym.dao.impl;

import com.xym.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:43
 * @author: 1931559710@qq.com
 * ClassName: AccountDaoImpl
 * Description:
 */

/**
 * 账户的持久层实现类
 */
@Repository("accountDao1")
public class AccountDaoImpl implements AccountDao {
    public void saveAccount() {
        System.out.println("保存了账户1");
    }
}
