package com.epam.task.fifth.parser;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParagraphParser extends AbstractParser {

    private final static String SENTENCE_SPLITTER = "((\\.{3})|\\.|!|\\?)";

    @Override
    public Component parse(String inputParagraph) {
        String[] sentences = inputParagraph.split(SENTENCE_SPLITTER);
        Composite paragraph = new Composite();
        Stream stream = Arrays.stream(sentences);
        stream.forEach(sentence -> {
            SentenceParser sentenceParser = new SentenceParser();
            setSuccessor(sentenceParser);
            Component component = getSuccessor().parse((String) sentence);
            paragraph.addComponent(component);
        });
        return paragraph;
    }

}
