package com.xym.util;

/**
 * @user: Hasee
 * @date: 2021/3/15 16:00
 * @author: 1931559710@qq.com
 * ClassName: TransactionManager
 * Description:
 */

/**
 * 和事物管理相关的工具类，它包含了开启事务、提交事务、回滚事务和释放连接
 */

public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    /**
     * 开启事务
     */
    public void beginTransaction() {
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
    public void commit() {
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 回滚事务
     */
    public void rollback() {
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 释放连接
     */
    public void release() {
        try {
            connectionUtils.getThreadConnection().close();  //把线程返回线程池
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
