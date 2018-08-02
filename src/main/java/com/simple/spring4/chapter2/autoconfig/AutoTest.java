package com.simple.spring4.chapter2.autoconfig;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 自动装配bean
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class AutoTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;
    @Test
    public void test1(){
        compactDisc.play();
    }

    @Test
    public void test2(){
        mediaPlayer.play();
    }
}
