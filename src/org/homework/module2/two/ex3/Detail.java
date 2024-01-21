package org.homework.module2.two.ex3;

import java.util.Objects;

public class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Detail detail = (Detail) o;
        return name.equals(detail.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Detail{" + "name='"
                + name + '\''
                + '}';
    }
}
