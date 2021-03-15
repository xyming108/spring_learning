package com.xym.proxy;

/**
 * @user: Hasee
 * @date: 2021/3/15 17:20
 * @author: 1931559710@qq.com
 * ClassName: Producer
 * Description:
 */
public class Producer implements IProducer {

    /**
     * 销售
     *
     * @param money
     */
    public void saleProduct(float money) {
        System.out.println("销售产品，并拿到钱" + money);
    }

    /**
     * 售后
     *
     * @param money
     */
    public void afterService(float money) {
        System.out.println("提供售后服务，并拿到钱" + money);
    }
}
