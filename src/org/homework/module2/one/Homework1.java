package org.homework.module2.one;

import org.homework.module2.one.ex1.Bird;
import org.homework.module2.one.ex1.Dog;
import org.homework.module2.one.ex1.Tiger;
import org.homework.module2.one.ex1.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        //Задание №1 Зоопарк
        //Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
        //Создать зоопарк, который может хранить в себе трех животных.
        //Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
        //Без дженериков задание принято не будет.
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Bird bird = new Bird();

        Zoo<Dog, Tiger, Bird> animalsZoo = new Zoo<>(dog, tiger, bird);
        animalsZoo.getDog().bark();
        animalsZoo.getTiger().growl();
        animalsZoo.getBird().fly();

        //
        //Задание №2
        //Создать два List с числами
        //Первый List: 5,2,4
        //Второй List: 7,10
        //Создать финальный лист и заполнить его данными из первого и второго листа, не используя for each.
        //Удалить 3 элемент в финальном листе. Вывести на экран индекс числа 10.
        //
        List<Integer> integerListOne = new ArrayList<>(List.of(5, 2, 4));
        List<Integer> integerListTwo = new ArrayList<>(List.of(7, 10));
//        List<Integer> finalList = Stream.of(integerListOne, integerListTwo)
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
        List<Integer> finalList = new ArrayList<>(integerListOne);
        finalList.addAll(integerListTwo);
        finalList.remove(3);
        System.out.println(finalList.indexOf(10));

        //Задание №3 Создать волшебный склад.
        //Создать класс Item - с единственным атрибутом - имя вещи.
        //Склад принимает в себя вещи. У склада нет ограничений в хранении.
        //Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
        //В складе должен быть метод: получить все вещи. Данный метод вернет список, в котором будет только каждая четная вещь из склада.
        //В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
        //Склад умеет удалять все вещи, кроме последней.
    }
}
