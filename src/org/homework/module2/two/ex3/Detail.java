package org.homework.module2.two.ex3;

public final class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Detail{" + "name='"
                + name + '\''
                + '}';
    }
}
