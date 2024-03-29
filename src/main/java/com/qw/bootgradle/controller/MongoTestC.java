package com.qw.bootgradle.controller;

import com.qw.bootgradle.dao.Mongo;
import com.qw.bootgradle.dao.tt;
import com.qw.bootgradle.service.MongoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MongoTestC {

    private final MongoDao mtdao;

    public MongoTestC(MongoDao mtdao) {
        this.mtdao = mtdao;
    }

    @RequestMapping(value = "/index")
    public String hello() {
        System.out.println("indexchegngong");

        return "/index";
    }

    @GetMapping(value = "/test1")
    public void saveTest() {
        Mongo mgtest = new Mongo();
        mgtest.setId(112);
        mgtest.setAge(332);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
        System.out.println("test1");
    }

    @GetMapping(value = "/test2")
    public List<tt> test2() {
        System.out.println("查询");
        List<tt> mgtest = mtdao.findTest();
       // System.out.println("mgtest is " + mgtest);
        return mgtest;
    }

    @GetMapping(value = "/test3")
    public void updateTest() {
        Mongo mgtest = new Mongo();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value = "/test4")
    public void deleteTestById() {
        mtdao.deleteTestById(11);
    }
}