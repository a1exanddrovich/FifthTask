package com.epam.task.fifth.parser;

public abstract class AbstractParser implements Parser {

    private AbstractParser successor;

    protected AbstractParser getSuccessor() {
        return this.successor;
    }

    protected void setSuccessor(AbstractParser successor) {
        this.successor = successor;
    }

//    public AbstractParser chain(AbstractParser successor) {
//        this.successor = successor;
//        return successor;
//    }

}
