package com.xym.proxy;

/**
 * @user: Hasee
 * @date: 2021/3/15 17:23
 * @author: 1931559710@qq.com
 * ClassName: IProducer
 * Description:
 */
public interface IProducer{
    /**
     * 销售
     *
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     *
     * @param money
     */
    public void afterService(float money);
}
