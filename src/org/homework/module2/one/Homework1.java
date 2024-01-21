package org.homework.module2.one;

import org.homework.module2.one.ex1.Bird;
import org.homework.module2.one.ex1.Dog;
import org.homework.module2.one.ex1.Tiger;
import org.homework.module2.one.ex1.Zoo;
import org.homework.module2.one.ex3.Item;
import org.homework.module2.one.ex3.Storehouse;

import java.util.ArrayList;
import java.util.List;


public class Homework1 {
    public static void main(String[] args) {
        ex1();
        System.out.println("------------");
        ex2();
        System.out.println("------------");
        ex3();
        //Задание №1 Зоопарк
        //Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
        //Создать зоопарк, который может хранить в себе трех животных.
        //Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
        //Без дженериков задание принято не будет.
        //
        //Задание №2
        //Создать два List с числами
        //Первый List: 5,2,4
        //Второй List: 7,10
        //Создать финальный лист и заполнить его данными из первого и второго листа, не используя for each.
        //Удалить 3 элемент в финальном листе. Вывести на экран индекс числа 10.
        //
    }

    public static void ex1() {
        Bird bird = new Bird();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        Zoo<Bird, Dog, Tiger> zoo = new Zoo<>(bird, dog, tiger);

        zoo.getAnimal1().fly();
        zoo.getAnimal2().bark();
        zoo.getAnimal3().growl();
    }

    public static void ex2() {
        List<Integer> integerListOne = new ArrayList<>(List.of(5, 2, 4));
        List<Integer> integerListTwo = new ArrayList<>(List.of(7, 10));
        List<Integer> finalList = new ArrayList<>(integerListOne);
        finalList.addAll(integerListTwo);
        finalList.remove(2);
        System.out.println(finalList.indexOf(10));
    }

    public static void ex3() {
        //Задание №3 Создать волшебный склад.
        Storehouse storehouse = new Storehouse();
        //Создать класс Item - с единственным атрибутом - имя вещи.
        //Склад принимает в себя вещи. У склада нет ограничений в хранении.
        storehouse.addItem(new Item("вилка"));
        storehouse.addItem(new Item("ложка"));
        storehouse.printAllItem();
        //Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemList.add(new Item("" + i));
        }
        storehouse.addItem(itemList);
        storehouse.printAllItem();
        //В складе должен быть метод: получить все вещи. Данный метод вернет список, в котором будет только каждая четная вещь из склада.
        List<Item> allEvenItem = storehouse.getAllEvenItem();
        for (Item item : allEvenItem) {
            System.out.print(item.getName() + " ");
        }
        //В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
        System.out.println("\n Берем вещь под индексом");
        storehouse.printAllItem();
        System.out.println("Вещь с индексом 0 " + storehouse.getItemByIndex(0).getName());
        storehouse.printAllItem();
        //Склад умеет удалять все вещи, кроме последней.
        storehouse.clearItemListExpectLast();
        storehouse.printAllItem();
    }
}
