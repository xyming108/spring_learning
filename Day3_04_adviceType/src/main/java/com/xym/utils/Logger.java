package com.xym.utils;

/**
 * @user: Hasee
 * @date: 2021/3/16 9:23
 * @author: 1931559710@qq.com
 * ClassName: Logger
 * Description:
 */

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 */
public class Logger {

    /**
     * 前置通知
     */
    public void BeforePrintLog() {
        System.out.println("前置通知Logger类中的BeforePrintLog方法开始记录日志了。。。");
    }

    /**
     * 后置通知
     */
    public void AfterReturnPrintLog() {
        System.out.println("后置通知Logger类中的AfterReturnPrintLog方法开始记录日志了。。。");
    }

    /**
     * 异常通知
     */
    public void AfterThrowingPrintLog() {
        System.out.println("异常通知Logger类中的AfterThrowingPrintLog方法开始记录日志了。。。");
    }

    /**
     * 最终通知
     */
    public void AfterPrintLog() {
        System.out.println("最终通知Logger类中的AfterPrintLog方法开始记录日志了。。。");
    }
}
