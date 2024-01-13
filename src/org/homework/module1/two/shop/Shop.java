package org.homework.module1.two.shop;

public class Shop {
    Worker[] worker;

    public Shop(Worker... worker) {
        this.worker = worker;
    }

    public void printInfo() {
        for (Worker value : worker) {
            System.out.println(value.name + " :" + value.age + " лет" + ", " + value.getGender()
                    + ", " + value.listOfItem());
        }
    }
}
