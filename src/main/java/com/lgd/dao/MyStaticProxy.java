package com.lgd.dao;

public class MyStaticProxy {
//    private BookDAOImpl bookDAO=new BookDAOImpl();
    private GenaralDAO genaralDAO;

    public MyStaticProxy(GenaralDAO genaralDAO) {
        this.genaralDAO = genaralDAO;
    }

    public void insert(){
        begin();
//        bookDAO.insert();
        genaralDAO.insert();
        commit();
    }
    public void delete(){
        begin();
//        bookDAO.delete();
        genaralDAO.delete();
        commit();
    }
    public void update(){
        begin();
//        bookDAO.update();
        genaralDAO.update();
        commit();
    }
    long time1;
    long time2;
    public void begin(){
        time1=System.currentTimeMillis();
        System.out.println("-----begin");
    }
    public void commit(){
        time2=System.currentTimeMillis();
        System.out.println("-----提交事务");
        System.out.println(genaralDAO.getClass()+"执行时间"+(time2-time1));
    }
}
