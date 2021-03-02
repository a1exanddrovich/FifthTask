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
    public int getCount() {
        return this.components.size();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

}
