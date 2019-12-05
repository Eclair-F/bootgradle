package com.qw.bootgradle.controller;

import com.qw.bootgradle.dao.Mongo;
import com.qw.bootgradle.service.MongoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoTestC {

    private final MongoDao mtdao;

    public MongoTestC(MongoDao mtdao) {
        this.mtdao = mtdao;
    }


    @GetMapping(value="/test1")
    public void saveTest()  {
        Mongo mgtest=new Mongo();
        mgtest.setId(112);
        mgtest.setAge(332);
        mgtest.setName("ceshi2222");
        mtdao.saveTest(mgtest);
        System.out.println("test1");
    }

    @GetMapping(value="/test2")
    public Mongo findTestByName(){
        Mongo mgtest= mtdao.findTestByName("ceshi");
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }

    @GetMapping(value="/test3")
    public void updateTest(){
        Mongo mgtest=new Mongo();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value="/test4")
    public void deleteTestById(){
        mtdao.deleteTestById(11);
    }
}