package com.th.test;

import com.th.dao.IPersonDAO;
import com.th.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testStoreBook() throws InterruptedException {
//        BookService bookservice = new BookService();
//        bookservice.storeBook("《Spring MVC权威指南 第一版》");
        //scan
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("IOCBeans01.xml");
//        BookService bookService = (BookService)ctx.getBean(BookService.class);
        BookService bookService = (BookService)ctx.getBean("bookService");
        bookService.storeBook("abccccc");
//        Thread.sleep(6000);

//        IPersonDAO personDAO1 = (IPersonDAO)ctx.getBean("personDAO");
//        IPersonDAO personDAO2 = (IPersonDAO)ctx.getBean("personDAO");
//        IPersonDAO personDAO3 = ctx.getBean(IPersonDAO.class);
//        System.out.println(personDAO1.say("abc") + "\t" + personDAO2.say("abc") + "\t" + personDAO3.say("abc"));
//        System.out.println((personDAO1 == personDAO2) + "\t" + (personDAO2 == personDAO3));

    }
}
