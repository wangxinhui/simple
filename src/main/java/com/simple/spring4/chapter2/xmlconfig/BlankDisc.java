package com.simple.spring4.chapter2.xmlconfig;

import java.util.List;

/**
 * @Author: by simple on 2018/8/20.
 */
public class BlankDisc implements CompactDisc {
 private String title;
 private String artist;
 //带List的BlankDisc
 private List<String> tracks;

 public BlankDisc(String title, String artist, List<String> tracks) {
  this.title = title;
  this.artist = artist;
  this.tracks = tracks;
 }

// public BlankDisc(String title, String artist) {
//  this.title = title;
//  this.artist = artist;
// }

 @Override
 public void play() {
  System.out.println("Playing " + title + " by " + artist);
  for (String track : tracks) {
   System.out.println("-Track: " + track);
  }

 }
}
