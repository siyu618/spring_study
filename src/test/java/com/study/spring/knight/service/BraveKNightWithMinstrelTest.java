package com.study.spring.knight.service;

import com.study.spring.knight.dao.IQuest;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


/**
 * Created by tianyuzhi on 17/12/8.
 */
public class BraveKNightWithMinstrelTest {


    @Test
    public void testXML() {
        BeanFactory factory = new ClassPathXmlApplicationContext("braveKnight_with_minstrel_content.xml");
        IKNight braveKNight = (IKNight)factory.getBean("knight2");
        braveKNight.embarkQuest();
    }
}