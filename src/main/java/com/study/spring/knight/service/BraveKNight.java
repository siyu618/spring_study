package com.study.spring.knight.service;

import com.study.spring.knight.dao.IQuest;
import lombok.Data;

/**
 *
 * @author tianyuzhi
 * @date 17/12/8
 */
@Data
public class BraveKNight implements IKNight {
    private IQuest quest = null;
    public BraveKNight(IQuest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkQuest() {
        quest.embark();
    }
}
