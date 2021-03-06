package com.simple.spring4.chapter2.xmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:chapter2.xmlconfig/xml_config_c.xml"})
public class XmlTest {

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void test1() {
        mediaPlayer.play();
    }
}
