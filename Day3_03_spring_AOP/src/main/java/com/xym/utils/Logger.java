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
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    public void printLog() {
        System.out.println("Logger类中的pringLog方法开始记录日志了。。。");
    }
}
