package com.study.spring.person.dao;

/**
 * Created by tianyuzhi on 17/12/7.
 * @author tianzhiyu
 */
public interface IPersonDao {
    default void save(){
        //dummy, do nothing
    }
}
