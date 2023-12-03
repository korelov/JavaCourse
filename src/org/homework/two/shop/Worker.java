package org.homework.two.shop;

public class Worker {
    String name;
    int age;
    char gender;
    Item[] item;

    public Worker(String name, int age, char gender, Item... item) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.item = item;
    }

    public String getGender() {
        if (this.gender == 'M') {
            return "мужчина";
        } else if (this.gender == 'F') {
            return "женщина";
        } else {
            return "осуждаю";
        }
    }

    public void boast() {
        for (Item value : item) {
            System.out.printf("%s смотрите какая у меня вещь - %s\n", this.name, value.name);
        }
    }

    public String listOfItem() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < item.length; i++) {
            if (i != item.length - 1) {
                stringBuilder.append(item[i].name).append(", ");
            } else {
                stringBuilder.append(item[i].name);
            }
        }
        return stringBuilder.toString();
    }
}
