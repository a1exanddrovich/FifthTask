package com.epam.task.fifth.parser;

import com.epam.task.fifth.component.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class SentenceParser extends AbstractParser{

    private final static String LEXEME_SPLITTER = "(\\,  |\\;  |\s)";

    @Override
    public Component parse(String inputSentence) {
        String[] words = inputSentence.split(LEXEME_SPLITTER);
        Composite sentence = new Composite();
        Stream stream = Arrays.stream(words);
        stream.forEach(lexeme -> {
            if(((String) lexeme).startsWith("[") && ((String) lexeme).endsWith("]")) {
                String clearedLexeme = ((String) lexeme).substring(1, ((String) lexeme).length() - 1);
                Expression expression = new Expression(clearedLexeme);
                sentence.addComponent(expression);
            } else {
               Word word = new Word((String) lexeme);
               sentence.addComponent(word);
            }
        });
        return sentence;
    }

}
