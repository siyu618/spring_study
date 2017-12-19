package com.study.spring.ch4.concert;

import com.study.spring.soundsystem.ICompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tianyuzhi
 * @date 17/12/19
 */

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public ICompactDisc sgtPeppers() {
        BlankDisk cd = new BlankDisk();
        cd.setTitle("Sgt. Pepper''s Lonely Hearts Club Band");
        cd.setArtist("The Beatles");

        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky wit Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
