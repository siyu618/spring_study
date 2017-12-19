package com.study.spring.knight.service;

import com.study.spring.knight.dao.IQuest;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.*;


/**
 * Created by tianyuzhi on 17/12/8.
 */
public class BraveKNightTest {
    @Test
    public void testEmbarkQuest() throws Exception {
        IQuest quest = Mockito.mock(IQuest.class);
        BraveKNight kNight = new BraveKNight(quest);
        kNight.embarkQuest();
        verify(quest, times(1)).embark();
    }

    @Test
    public void testXML() {
        BeanFactory factory = new ClassPathXmlApplicationContext("braveKnight_content.xml");
        BraveKNight braveKNight = (BraveKNight)factory.getBean("knight");
        braveKNight.embarkQuest();
    }
}