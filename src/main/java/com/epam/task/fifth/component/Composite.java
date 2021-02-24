package com.epam.task.fifth.component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return this.components;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void operation(Component component) {
        System.out.println("Operating something...");
    }

}
