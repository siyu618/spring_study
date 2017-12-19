package com.study.spring.soundsystem2;

import com.study.spring.soundsystem.CDPlayer2;
import com.study.spring.soundsystem.ICompactDisc;
import com.study.spring.soundsystem.IMediaPlayer;
import com.study.spring.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tianyuzhi on 17/12/12.
 */
@Configuration
public class CDPlayerJavaConfig {

    @Bean
    public ICompactDisc sgetPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public IMediaPlayer getCDPlayer2() {
        return new CDPlayer2(sgetPeppers());
    }
}
