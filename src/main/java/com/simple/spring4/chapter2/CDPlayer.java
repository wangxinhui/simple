package com.simple.spring4.chapter2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public void setcom(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
