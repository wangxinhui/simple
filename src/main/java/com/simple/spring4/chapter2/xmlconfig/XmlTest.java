package com.simple.spring4.chapter2.xmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:chapter2.xmlconfig/xmlconfig.xml"})
public class XmlTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void test1() {
        compactDisc.play();
    }
}
