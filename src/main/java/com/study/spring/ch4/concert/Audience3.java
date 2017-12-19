package com.study.spring.ch4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by tianyuzhi on 17/12/19.
 */

@Aspect
public class Audience3 {

    @Pointcut(value = "execution(** com.study.spring.ch4.concert.Peformance.perform(..))")
    public void perform() {}

    @Around("perform()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            silenceCellPhones();
            takeSeats();
            jp.proceed();
            applause();
        } catch (Throwable throwable) {
            demandRefund();
        }

    }

    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("take seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
