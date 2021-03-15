package com.xym.service;

/**
 * @user: Hasee
 * @date: 2021/3/14 11:29
 * @author: 1931559710@qq.com
 * ClassName: AccountService
 * Description:
 */

import com.xym.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface AccountService {

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
     * 转账
     *
     * @param sourceName 转出账户名称
     * @param targetName 转入账户名称
     * @param money      转账金额
     */
    void transfer(String sourceName, String targetName, Float money);
}
