package com.epam.task.fifth.component;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Word)){
            return false;
        }
        Word current = (Word) o;
        return getWord().equals(current.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord());
    }
}
