package com.study.spring.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by tianyuzhi on 17/12/11.
 */
@Component
public class SgtPeppers implements ICompactDisc {
    private String title = "Sgt. Peppers's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println(this.hashCode());
        System.out.println("Playing " + title + " by " + artist);
    }
}
