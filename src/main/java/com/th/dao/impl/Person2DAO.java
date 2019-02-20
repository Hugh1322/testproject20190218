package com.th.dao.impl;

import com.th.dao.IPersonDAO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


//@Service("PersonDAO")
//@Resource(name="personDAO")
//@Component
@Repository("person2DAO")
@Primary
public class Person2DAO implements IPersonDAO {
    public String say(String a) {
        System.out.println("Person222DAO .. say ...");
        return " from Person222DAO : " + a;
    }
}
