package com.lgd.dao;

import static org.junit.jupiter.api.Assertions.*;

class JDKDynamicProxyTest {

    @org.junit.jupiter.api.Test
    void getProxy() {
        BookDAOImpl bookDAO=new BookDAOImpl();
        StudentDAOImpl studentDAO=new StudentDAOImpl();
//        GenaralDAO proxy = (GenaralDAO) new JDKDynamicProxy(bookDAO).getProxy();
        GenaralDAO proxy = (GenaralDAO) new JDKDynamicProxy(studentDAO).getProxy();
//        proxy.delete();
        proxy.insert();
    }

    @org.junit.jupiter.api.Test
    void setObj() {
    }
}