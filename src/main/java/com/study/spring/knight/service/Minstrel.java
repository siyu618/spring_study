package com.study.spring.knight.service;

import java.io.PrintStream;

/**
 *
 * @author tianyuzhi
 * @date 17/12/8
 */
public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }
    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did embark on a quest!");
    }

}
