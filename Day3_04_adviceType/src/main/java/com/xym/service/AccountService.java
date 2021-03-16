package com.xym.service;

/**
 * @user: Hasee
 * @date: 2021/3/16 8:59
 * @author: 1931559710@qq.com
 * ClassName: AccountService
 * Description:
 */

/**
 * 账户的业务层接口
 */
public interface AccountService {

    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     *
     * @param i
     */
    void updateAccount(int i);

    /**
     * 删除账户
     */
    int deleteAccount();
}
