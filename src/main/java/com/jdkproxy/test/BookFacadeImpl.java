package com.jdkproxy.test;

/**
 * Created by Administrator on 2016/7/21.
 */
public class BookFacadeImpl implements BookFacade{
    public int addBook() {
        System.out.println("增加书本");
        return 1;
    }
    public int deleteBook() {
        System.out.println("删除书本");
        return 1;
    }
}
