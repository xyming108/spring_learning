package com.xym.service.impl;

import com.xym.service.AccountService;

import java.util.*;

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
public class AccountServiceImpl3 implements AccountService {

    private String[] myStr;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProps;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStr));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}
