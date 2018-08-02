package com.simple.spring4.chapter2.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{

    @Autowired
    private CompactDisc compactDisc;

    @Override
    public void play() {
        compactDisc.play();
    }
}
