package com.simple.spring4.chapter2.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc disc) {
        this.compactDisc = disc;
    }
    @Override
    public void play() {
        compactDisc.play();
    }
}
