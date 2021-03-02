package com.epam.task.fifth.logic;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import java.util.List;

public class TextLogic {

    public void sortParagraphsBySentences(Component text) {
        List<Component> paragraphs = ((Composite) text).getComponents();
        paragraphs.sort((Component first, Component second) -> (second.getCount() - first.getCount()));
    }

    public void sortSentencesByWordsLength(Component text) {
        for(Component paragraph : ((Composite) text).getComponents()) {
            for(Component sentence : ((Composite) paragraph).getComponents()) {
                Composite currentSentence = (Composite) sentence;
                List<Component> lexemes = currentSentence.getComponents();
                lexemes.sort((Component first, Component second) -> (second.getCount() - first.getCount()));
            }
        }
    }

}
