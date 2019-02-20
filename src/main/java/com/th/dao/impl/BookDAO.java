package com.th.dao.impl;

import com.th.dao.IBookDAO;
import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BookDAO implements IBookDAO, DisposableBean {
    public String addBook(String bookname) {
        return "添加图书"+bookname+"成功！";
    }

//    @PostConstruct
    private void init() {
        System.out.println("init BookDAO ... .");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("I'm  destroy method  using  @PreDestroy.....");
    }
}
