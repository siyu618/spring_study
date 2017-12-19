package com.study.spring.ch4.concert;

import com.study.spring.soundsystem.ICompactDisc;
import lombok.Setter;
import java.util.List;

/**
 * Created by tianyuzhi on 17/12/19.
 */
public class BlankDisk implements ICompactDisc {
    @Setter
    private String title;
    @Setter
    private String artist;
    @Setter
    private List<String> tracks;

    @Override
    public void play() {

    }

//    @Override
//    public void playTrack(int i) {
//
//    }
}
