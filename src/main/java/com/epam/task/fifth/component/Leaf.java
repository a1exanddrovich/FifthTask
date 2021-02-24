package com.epam.task.fifth.component;

public class Leaf implements Component {

    private String word = new String();

    public Leaf(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add anything to leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove anything from leaf");
    }

    @Override
    public void operation(Component component) {
        System.out.println("Nothing to be operated");
    }

}
