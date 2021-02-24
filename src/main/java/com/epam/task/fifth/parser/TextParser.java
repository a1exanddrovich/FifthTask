package com.epam.task.fifth.parser;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import java.util.Arrays;
import java.util.stream.Stream;

public class TextParser extends AbstractParser {

    private final static String SPLITTER_OF_PARAGRAPHS = "\n";

    @Override
    public Component parse(String inputText) {
        String[] paragraphs = inputText.split(SPLITTER_OF_PARAGRAPHS);
        Composite text = new Composite();
        Stream stream = Arrays.stream(paragraphs);
        stream.forEach(paragraph -> {
            ParagraphParser nextParser = new ParagraphParser();
            setSuccessor(nextParser);
            Component component = getSuccessor().parse((String) paragraph);
            text.add(component);
        });
        return text;
    }

}
