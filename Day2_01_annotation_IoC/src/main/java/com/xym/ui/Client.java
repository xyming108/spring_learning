package com.xym.ui;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:45
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

import com.xym.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
曾经XML的配置：
  <bean id="accountService" class="com.xym.service.impl.AccountServiceImpl" scope="" init-method="" destroy-method="">
       <property name="" value=""/ref=""></property>
  </bean>

改用注释的方法：
用于创建对象的：
   他们的作用就和在xml配置文件中编写一个<bean>标签的功能是一样的
   @Component
        作用：用于把当前类对象存入spring容器中
        属性：
            value：用于指定bean的id，当我们不写时，它的默认值是当前类名，且首字母改小写

用于注入数据的：
   他们的作用就和在xml配置文件中的bean标签中写一个<property>标签的作用是一样的

用于改变作用范围的：
   他们的作用就和在bean标签中使用scope属性实现功能是一样的

和生命周期相关：
   他们的作用就和在bean标签中使用init-method和destroy-method的作用是一样的
*/

public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean对象
        AccountService as = (AccountService) ac.getBean("accountService");
        System.out.println(as);
//        as.saveAccount();
    }
}

