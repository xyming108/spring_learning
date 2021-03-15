package com.xym.dao;

/**
 * @user: Hasee
 * @date: 2021/3/14 11:39
 * @author: 1931559710@qq.com
 * ClassName: AccountDao
 * Description:
 */

import com.xym.domain.Account;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface AccountDao {

    /**
     * 查询所有
     *
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     *
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存
     *
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     *
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     *
     * @param accounId
     */
    void deleteAccount(Integer accounId);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return  如果有唯一的一个结果就返回，如果没有结果就返回null
     */
    Account findAccountByName(String accountName);

}
