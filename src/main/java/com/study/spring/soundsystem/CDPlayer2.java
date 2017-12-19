package com.study.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tianyuzhi on 17/12/11.
 */
@Component
public class CDPlayer2 implements IMediaPlayer {
    private ICompactDisc compactDisc;

    @Autowired
    public CDPlayer2(ICompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
    @Override
    public void play() {
        compactDisc.play();
    }
}
