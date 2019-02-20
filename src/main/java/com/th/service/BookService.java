package com.th.service;

import com.th.dao.IBookDAO;
import com.th.dao.IPersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    IBookDAO bookDAO;

    @Autowired
    @Qualifier("personDAO")
    IPersonDAO personDAO;

    public BookService() {
        //容器
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("IOCBeans01.xml");
//        //从容器中获得id为bookdao的bean
//        bookDAO=(IBookDAO)ctx.getBean("bookdao");
    }

    public void storeBook(String bookname){
        System.out.println("图书上货");
        String result=bookDAO.addBook(bookname);
        System.out.println(result);
        System.out.println(personDAO.say(bookname));
    }
}
