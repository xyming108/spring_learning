package com.xym.service.impl;

import com.xym.dao.AccountDao;
import com.xym.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @user: Hasee
 * @date: 2021/2/24 21:39
 * @author: 1931559710@qq.com
 * ClassName: AccountServiceImpl
 * Description:
 */

/**
 * 业务层实现类
 */

@Service(value = "accountService")    //如果只有一个属性，value可以省略不写，直接写"accountService"
@Scope("singleton")
public class AccountServiceImpl implements AccountService {

    //    @Autowired
//    @Qualifier("accountDao1")   //要和@Autowired配合使用
    @Resource(name = "accountDao2")
    private AccountDao accountDao = null;

    @PostConstruct
    public void init() {
        System.out.println("初始化执行了方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁方法执行了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
