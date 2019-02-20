package com.th.dao.impl;

import com.th.dao.IPersonDAO;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//@Service("PersonDAO")
//@Resource(name="personDAO")
//@Component
@Repository("personDAO")
@Scope("prototype")
@Lazy
public class PersonDAO implements IPersonDAO {
    public String say(String a) {
        System.out.println("PersonDAO .. say ...");
        return " from PersonDAO : " + a;
    }
}
