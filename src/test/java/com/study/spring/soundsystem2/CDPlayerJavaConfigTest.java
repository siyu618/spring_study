package com.study.spring.soundsystem2;

import com.study.spring.soundsystem.ICompactDisc;
import com.study.spring.soundsystem.IMediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.*;

/**
 * Created by tianyuzhi on 17/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerJavaConfig.class)
public class CDPlayerJavaConfigTest {
    @Rule
    public final SystemOutRule rule = new SystemOutRule();

    @Autowired
    private IMediaPlayer mediaPlayer;
    @Autowired
    private ICompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);
    }
    @Test
    public void play() {
        mediaPlayer.play();
        //cd.play();// has the same output with mediaPlayer.play();
        assertEquals(rule.enableLog().getLog(), "Playing Sgt. Peppers's Lonely Hearts Club Band by The Beatles");
    }
}