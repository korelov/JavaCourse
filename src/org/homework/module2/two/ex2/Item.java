package org.homework.module2.two.ex2;

import java.util.Objects;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
