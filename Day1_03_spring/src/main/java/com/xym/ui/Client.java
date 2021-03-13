package com.xym.ui;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:45
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

import com.xym.dao.AccountDao;
import com.xym.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取spring的IoC核心容器，并且根据id获取对象
     * <p>
     * ApplicationContext的三个常用实现类：
     * ClassPathXmlApplicationContext：可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在就加载不了
     * FileSystemXmlApplicationContext：他可以加载磁盘任意路径下的配置文件（必须有访问权限）
     * AnnotationConfigApplicationContext：他是用于读取注解创建容器的
     * <p>
     * 核心容器的两个接口引发出的问题：
     * ApplicationContext： 单例对象适用（多用此接口）
     * 他在构建核心容器时，创建对象采取的策略是采用立即加载的方式，也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象
     * BeanFactory： 多例对象适用
     * 他在构建核心容器时，创建对象采取的策略是采用延迟加载的方式，也就是说，什么时候根据id获取对象了，什么时候才真正创建对象
     *
     * @param args
     */
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext acc = new FileSystemXmlApplicationContext("E:\\Java Code\\spring_learning\\Day1_03_spring\\src\\main\\resources\\bean" +
//                ".xml");

        //根据id获取Bean对象
        //两种强转方式
        AccountService as = (AccountService) ac.getBean("accountService");
        AccountDao adao = ac.getBean("accountDao", AccountDao.class);

        System.out.println(as);
        System.out.println(adao);
        as.saveAccount();

        //------------------------------------------------

//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        AccountService as = (AccountService) factory.getBean("accountService");
//        System.out.println(as);
    }
}
