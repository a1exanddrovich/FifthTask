package com.epam.task.fifth.parser;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import com.epam.task.fifth.component.Leaf;
import java.util.Arrays;
import java.util.stream.Stream;

public class SentenceParser extends AbstractParser{

    private final static String SPLITTER_OF_WORDS = " ";

    @Override
    public Component parse(String inputSentence) {
        String[] words = inputSentence.split(SPLITTER_OF_WORDS);
        Composite sentence = new Composite();
        Stream stream = Arrays.stream(words);
        stream.forEach(word -> {
            Leaf leafWord = new Leaf((String) word);
            sentence.add(leafWord);
        });
        return sentence;
    }

}
