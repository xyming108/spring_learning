package com.xym.test;

/**
 * @user: Hasee
 * @date: 2021/3/14 13:54
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceTest
 * Description:
 */

import com.xym.domain.Account;
import com.xym.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit单元测试，测试我们的配置
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService as = null;

    @Test
    public void testTransfer() {
        as.transfer("aaa", "bbb", 100f);
    }

}
