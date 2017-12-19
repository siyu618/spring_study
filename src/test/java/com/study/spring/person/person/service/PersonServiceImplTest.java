package com.study.spring.person.person.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * Created by tianyuzhi on 17/12/8.
 */
public class PersonServiceImplTest {
    private BeanFactory factory = null;

    @BeforeMethod
    public void before () {
        factory = new ClassPathXmlApplicationContext("person_content.xml");
    }
    @Test
    public void testProcessSave() throws Exception {
        IPersonService personService = (IPersonService)factory.getBean("personService");
        personService.processSave();
    }

}