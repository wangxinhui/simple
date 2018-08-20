package com.simple.spring4.chapter2.xmlconfig;

import java.util.List;

/**
 * @Author: by simple on 2018/8/20.
 */
public class Discography implements CompactDisc {
 private String artist;
 private List<CompactDisc> cds;

 public Discography(String artist, List<CompactDisc> cds) {
  this.artist = artist;
  this.cds = cds;
 }

 @Override
 public void play() {
  for (CompactDisc compactDisc :cds){
   compactDisc.play();
  }
 }
}
