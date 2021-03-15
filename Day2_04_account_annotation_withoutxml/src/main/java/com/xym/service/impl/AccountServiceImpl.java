package com.xym.service.impl;

import com.xym.dao.AccountDao;
import com.xym.domain.Account;
import com.xym.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/3/14 11:34
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceImpl
 * Description:
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accounId) {
        accountDao.deleteAccount(accounId);
    }
}
