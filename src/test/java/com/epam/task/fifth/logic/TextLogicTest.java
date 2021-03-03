package com.epam.task.fifth.logic;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.parser.TextParser;
import org.junit.Assert;
import org.junit.Test;

public class TextLogicTest {

    private final String firstSample = "second second second\n " +
            "first first first first\n" +
            "third";

    private final String secondSample = "third\n" +
            "second second second\n" +
            "first first first first";

    private final TextParser textParser = new TextParser();
    private final Component text = textParser.parse(firstSample);
    private final Component result = textParser.parse(secondSample);
    private final TextLogic logic = new TextLogic();

    @Test
    public void testShouldSortParagraphsBySentencesInText() {

        //when
        logic.sortParagraphsBySentences(text);

        //then
        Assert.assertEquals(result, text);

    }

    @Test
    public void testShouldSortSentencesByWordsLength() {

        //when
        logic.sortSentencesByWordsLength(text);

        //then
        Assert.assertEquals(result, text);

    }

}
