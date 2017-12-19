package com.study.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tianyuzhi on 17/12/11.
 */
public class CDPlayer {
    private ICompactDisc compactDisc;

    @Autowired
    public CDPlayer(ICompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
}
