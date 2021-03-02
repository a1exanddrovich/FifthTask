package com.epam.task.fifth.component;

public class Word implements Component {

    private String word = new String();

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int getCount() {
        return this.word.length();
    }

}
