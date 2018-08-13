package com.simple.springcp.spring4.chapter2;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * @Author: by simple on 2018/6/28.
 */

/**
 * Spring支持将@Named作为@Component注解的替代方案，两者之间与偶一些细微的差异
 * //TODO 差异在哪里
 */
//@Named
@Component
public class VictoryMusic implements CompactDisc{
    private String title = "From far away\n" +
            "\n" +
            "In mountains deep\n" +
            "\n" +
            "The night of blood\n" +
            "\n" +
            "In twilight sleep\n" +
            "\n" +
            "The armies fight\n" +
            "\n" +
            "For king and queen\n" +
            "\n" +
            "There will be no\n" +
            "\n" +
            "No victory\n" +
            "\n" +
            "The swords collide\n" +
            "\n" +
            "With power and force\n" +
            "\n" +
            "As mighty men\n" +
            "\n" +
            "Show no remorse\n" +
            "\n" +
            "It is the time\n" +
            "\n" +
            "The snow is melting\n" +
            "\n" +
            "It is the time\n" +
            "\n" +
            "Of reckoning\n";
    private String artist = " Two Steps from Hell";

    @Override
    public void play() {
        System.out.println("Playing\n " + title + " by " + artist);
    }
}
