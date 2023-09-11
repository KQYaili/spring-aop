package com.lgd.dao;

public class BookDAOImpl{
    public void insert(){
//        System.out.println("-----begin");
        System.out.println("--insert--book");
//        throw  new NullPointerException();
//        System.out.println("-----提交事务");

    }
    public void delete(){
//        System.out.println("-----begin");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--delete--book");
//        System.out.println("-----提交事务");
    }
    public void update(){
//        System.out.println("-----begin");
        System.out.println("--update--book");
//        System.out.println("-----提交事务");
    }
}
