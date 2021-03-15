package com.xym.test;

/**
 * @user: Hasee
 * @date: 2021/3/14 18:07
 * @author: 1931559710@qq.com
 * ClassName: QueryRunnerTest
 * Description:
 */

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试queryrunner是否单例
 */
public class QueryRunnerTest {
    @Test
    public void testQueryRunner() {
        //获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //获取queryRunner对象
        QueryRunner runner = ac.getBean("runner", QueryRunner.class);
        QueryRunner runner1 = ac.getBean("runner", QueryRunner.class);
        System.out.println(runner == runner1);

    }
}
