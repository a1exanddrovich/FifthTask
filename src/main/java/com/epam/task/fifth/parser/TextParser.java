package com.epam.task.fifth.parser;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import java.util.Arrays;
import java.util.stream.Stream;

public class TextParser extends AbstractParser {

    private final static String PARAGRAPH_SPLITTER = "\n";

    @Override
    public Component parse(String inputText) {
        String[] paragraphs = inputText.split(PARAGRAPH_SPLITTER);
        Composite text = new Composite();
        Stream stream = Arrays.stream(paragraphs);
        stream.forEach(paragraph -> {
            ParagraphParser paragraphParser = new ParagraphParser();
            setSuccessor(paragraphParser);
            Component component = getSuccessor().parse((String) paragraph);
            text.addComponent(component);
        });
        return text;
    }


}
