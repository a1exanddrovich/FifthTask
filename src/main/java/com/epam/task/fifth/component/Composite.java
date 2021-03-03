package com.epam.task.fifth.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Composite)){
            return false;
        }
        Composite composite = (Composite) o;
        return Objects.equals(getComponents(), composite.getComponents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getComponents());
    }
}
