package com.lgd.test;

import com.lgd.dao.*;
import com.lgd.service.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        BookDAOImpl bookDAO=new BookDAOImpl();
////        StudentDAOImpl studentDAO = new StudentDAOImpl();
////        bookDAO.delete();
////
////        MyStaticProxy myStaticProxy = new MyStaticProxy(bookDAO);
////        myStaticProxy.delete();
//        CGLibDynamicProxy cgLibDynamicProxy = new CGLibDynamicProxy(bookDAO);
//        BookDAOImpl proxy = (BookDAOImpl) cgLibDynamicProxy.getProxy();
//        proxy.update();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDAOImpl bookDAO=(BookDAOImpl) context.getBean("bookDAO");
        StudentDAOImpl studentDAO=(StudentDAOImpl)context.getBean("studentDAO");
        bookDAO.update();
        bookDAO.delete();
        studentDAO.delete(12);
//        BookServiceImpl bookService = new BookServiceImpl();
        BookServiceImpl bookServiceImpl = (BookServiceImpl) context.getBean("BookServiceImpl");
        System.out.println(bookServiceImpl);
//        bookServiceImpl.addBook();
        bookDAO.insert();
        UserDAOImpl userDAOImpl = (UserDAOImpl) context.getBean("userDAOImpl");
        userDAOImpl.insert();
    }

}
