package com.xym.ui;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:45
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

import com.xym.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
曾经XML的配置：
    <bean id="accountService" class="com.xym.service.impl.AccountServiceImpl" scope="" init-method="" destroy-method="">
       <property name="" value=""/ref=""></property>
    </bean>

改用注释的方法：
    用于创建对象的：
       他们的作用就和在xml配置文件中编写一个<bean>标签的功能是一样的
       @Component （当不属于下面这三层时可以使用Component）
            作用：用于把当前类对象存入spring容器中
            属性：
                value：用于指定bean的id，当我们不写时，它的默认值是当前类名，且首字母改小写
        @Controller：一般用在表现层
        @Service：一般用在业务层
        @Repository：一般用在持久层
        以上三个注解他们的作用和属性与Component是一模一样的，
        他们三个是spring框架为我们提供明确的三层注释，使我们的三层对象更加清晰


    用于注入数据的：
       他们的作用就和在xml配置文件中的bean标签中写一个<property>标签的作用是一样的
       Autowired：
            作用：自动按照类型注入，只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
                    如果IoC容器中没有任何bean的类型和要注入的变量类型匹配，则报错
                    如果IoC容器中有多个类型匹配时，需要写出明确的变量类型
            出现位置：
                可以是变量上，也可以是方法上
            细节：
                在使用注解注入时，set方法就不是必须的了
        Qualifier：
            作用：在按照类型注入的基础上再按照名称注入，它在给类成员注入时不能单独使用，
                    但是在给方法参数注入时可以
            属性：
                value：用于指定注入bean的id
        Resource：
            作用：直接按照bean的id注入，它可以独立使用
            属性：
                name：用于指定bean的id
        以上三个注入都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现
        另外，集合类型的注入只能通过xml来实现
        value：
            作用：用于注入基本类型和String类型的数据
            属性：
                value：用于指定数据的值，它可以使用spring中SpEL（也就是spring的EL表达式）
                        SpEL的写法：${表达式}


    用于改变作用范围的：
       他们的作用就和在bean标签中使用scope属性实现功能是一样的
       Scope：
        作用：用于指定bean的作用范围
        属性：
            value：指定范围的取值，常用取值：singleton，prototype


    和生命周期相关：
       他们的作用就和在bean标签中使用init-method和destroy-method的作用是一样的
       PreDestroy
            作用：用于指定销毁方法
       PostConstruct
            作用：用于指定初始化方法

*/

public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean对象
        AccountService as = (AccountService) ac.getBean("accountService");
//        AccountService as2 = (AccountService) ac.getBean("accountService");
//        System.out.println(as);
//
//        AccountDao adao = ac.getBean("accountDao", AccountDao.class);
//        System.out.println(adao);

//        System.out.println(as == as2);
        as.saveAccount();
        ac.close();

    }
}

