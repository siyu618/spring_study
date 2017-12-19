package com.study.spring.knight.dao;

import java.io.PrintStream;

/**
 *
 * @author tianyuzhi
 * @date 17/12/8
 */
public class SlayDragonQuest implements IQuest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon.");
    }
}
