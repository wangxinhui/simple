package com.simple.springcp.spring4.chapter2;

import org.springframework.stereotype.Component;

/**
 * @Author: by simple on 2018/6/28.
 */
//@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt,Pepper's Lonely Hearts Club Band";
    private String artist = " The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
