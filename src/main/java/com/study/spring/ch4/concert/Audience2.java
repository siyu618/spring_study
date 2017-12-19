package com.study.spring.ch4.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by tianyuzhi on 17/12/19.
 */

@Aspect
public class Audience2 {

    @Pointcut(value = "execution(** com.study.spring.ch4.concert.Peformance.perform(..))")
    public void perform() {}

    @Before("perform()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("perform()")
    public void takeSeats() {
        System.out.println("take seats");
    }

    @AfterReturning("perform()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
