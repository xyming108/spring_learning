package com.xym.service.impl;

import com.xym.dao.AccountDao;
import com.xym.domain.Account;
import com.xym.service.AccountService;
import com.xym.util.TransactionManager;

import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/3/14 11:34
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceImpl
 * Description:
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private TransactionManager transactionManager;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

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

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer......");
        //根据名称查询转出账户
        Account source = accountDao.findAccountByName(sourceName);
        //根据名称查询转入账户
        Account target = accountDao.findAccountByName(targetName);
        //转出账户减钱
        source.setMoney(source.getMoney() - money);
        //转入账户加钱
        target.setMoney(target.getMoney() + money);
        //更新转出账户
        accountDao.updateAccount(source);
        //更新转入账户
        accountDao.updateAccount(target);
    }
}
