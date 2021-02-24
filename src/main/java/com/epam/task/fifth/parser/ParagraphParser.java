package com.epam.task.fifth.parser;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParagraphParser extends AbstractParser {

    private final static String SPLITTER_OF_SENTENCES = ".";

    @Override
    public Component parse(String inputParagraph) {
        String[] sentences = inputParagraph.split(SPLITTER_OF_SENTENCES);
        Composite paragraph = new Composite();
        Stream stream = Arrays.stream(sentences);
        stream.forEach(sentence -> {
            SentenceParser nextParser = new SentenceParser();
            setSuccessor(nextParser);
            Component component = getSuccessor().parse((String) sentence);
            paragraph.add(component);
        });
        return paragraph;
    }

}
