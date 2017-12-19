package com.study.spring.ch4.concert;

import com.study.spring.soundsystem.ICompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.*;

/**
 * Created by tianyuzhi on 17/12/19.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)

public class TrackCounterConfigTest {

    @Autowired
    private ICompactDisc cd;
    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {

        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);

        assert  1 == counter.getPlayCount(1);
        assert  1 == counter.getPlayCount(2);
        assert  4 == counter.getPlayCount(3);
        assert  0 == counter.getPlayCount(4);
        assert  0 == counter.getPlayCount(5);
        assert  0 == counter.getPlayCount(6);
        assert  2 == counter.getPlayCount(7);

    }

}