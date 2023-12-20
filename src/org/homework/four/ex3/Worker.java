package org.homework.four.ex3;

public class Worker extends Human {
    @Override
    public String makeSound() {
        return "Я строитель." + " " + super.makeSound();
    }
}
