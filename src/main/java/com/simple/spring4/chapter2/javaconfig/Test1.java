package com.simple.spring4.chapter2.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class Test1 {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test1() {
        compactDisc.play();
    }
}
