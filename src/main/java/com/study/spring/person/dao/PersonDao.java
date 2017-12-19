package com.study.spring.person.dao;

/**
 *
 * @author tianyuzhi
 * @date 17/12/7
 */
public class PersonDao implements IPersonDao {
    @Override
    public void save() {
        System.out.println("=====PersonDao.save()====");
    }
}
