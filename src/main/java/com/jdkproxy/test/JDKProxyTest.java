package com.jdkproxy.test;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/7/21.
 */
public class JDKProxyTest {
    public  static void  main(String args[]){
        BookFacadeImpl bookFacadeImple=new BookFacadeImpl();
        BookFacadeProxy proxy=new BookFacadeProxy(bookFacadeImple);
        BookFacade bookFacade=(BookFacade)Proxy.newProxyInstance(bookFacadeImple.getClass().getClassLoader(),bookFacadeImple.getClass().getInterfaces(),proxy);
        bookFacade.addBook();
        bookFacade.deleteBook();
    }

}
