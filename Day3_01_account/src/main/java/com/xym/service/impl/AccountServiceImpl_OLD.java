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
public class AccountServiceImpl_OLD implements AccountService {

    private AccountDao accountDao;
    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        try {
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            List<Account> accounts = accountDao.findAllAccount();
            //提交事务
            transactionManager.commit();
            //返回结果
            return accounts;
        } catch (Exception e) {
            //回滚操作
            transactionManager.rollback();
            throw new RuntimeException(e);
        } finally {
            //释放连接
            transactionManager.release();
        }
    }

    @Override
    public Account findAccountById(Integer accountId) {
        try {
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            Account account = accountDao.findAccountById(accountId);
            //提交事务
            transactionManager.commit();
            //返回结果
            return account;
        } catch (Exception e) {
            //回滚操作
            transactionManager.rollback();
            throw new RuntimeException(e);
        } finally {
            //释放连接
            transactionManager.release();
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            accountDao.saveAccount(account);
            //提交事务
            transactionManager.commit();
        } catch (Exception e) {
            //回滚操作
            transactionManager.rollback();
        } finally {
            //释放连接
            transactionManager.release();
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            accountDao.updateAccount(account);
            //提交事务
            transactionManager.commit();
        } catch (Exception e) {
            //回滚操作
            transactionManager.rollback();
        } finally {
            //释放连接
            transactionManager.release();
        }
    }

    @Override
    public void deleteAccount(Integer accounId) {
        try {
            //开启事务
            transactionManager.beginTransaction();
            //执行操作
            accountDao.deleteAccount(accounId);
            //提交事务
            transactionManager.commit();
        } catch (Exception e) {
            //回滚操作
            transactionManager.rollback();
        } finally {
            //释放连接
            transactionManager.release();
        }
    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        try {
            //1、开启事务
            transactionManager.beginTransaction();

            //2、执行操作
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

            //3、提交事务
            transactionManager.commit();
        } catch (Exception e) {
            //回滚操作
            transactionManager.rollback();
            e.printStackTrace();
        } finally {
            //释放连接
            transactionManager.release();
        }
    }
}
