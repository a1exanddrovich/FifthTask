package com.epam.task.fifth.logic;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TextLogic {

    private final static Logger LOGGER = LogManager.getLogManager().getLogger("TextLogic");

    public void sortParagraphsBySentences(Component text) {
        LOGGER.info("Sorting paragraphs by sentences has been started...");
        List<Component> paragraphs = ((Composite) text).getComponents();
        paragraphs.sort((Component first, Component second) -> (second.getCount() - first.getCount()));
        LOGGER.info("Sorting paragraphs by sentences has been finished successfully");
    }

    public void sortSentencesByWordsLength(Component text) {
        LOGGER.info("Sorting sentences by words has been started...");
        for(Component paragraph : ((Composite) text).getComponents()) {
            for(Component sentence : ((Composite) paragraph).getComponents()) {
                Composite currentSentence = (Composite) sentence;
                List<Component> lexemes = currentSentence.getComponents();
                lexemes.sort((Component first, Component second) -> (second.getCount() - first.getCount()));
            }
        }
        LOGGER.info("Sorting sentences by words has been finished successfully");
    }

}
