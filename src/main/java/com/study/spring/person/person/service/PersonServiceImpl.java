package com.study.spring.person.person.service;

import com.study.spring.person.dao.IPersonDao;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by tianyuzhi on 17/12/7.
 * @author
 */
public class PersonServiceImpl implements IPersonService {

    @Getter
    @Setter
    private IPersonDao personDao = null;

    @Override
    public void processSave() {
        System.out.println("==========PersonServiceImpl.processSave()====");
        personDao.save();
    }
}
