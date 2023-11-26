package org.example.homework;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        name = name.trim();
        name = name.toUpperCase();

        if (name.toLowerCase().contains("ова ")) {
            System.out.printf("Уважаемая %s\n", name);
        } else if (name.toLowerCase().contains("ов ")) {
            System.out.printf("Уважаемый %s\n", name);
        } else {
            System.out.printf("Неизвестное лицо %s\n", name);
        }
    }

    public static void ex2() {

        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors && isEngineWork) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        String simply = "this is simply. This is my favorite song.";
        simply = simply.toLowerCase().replace("this is", "those are");

        for (int i = 0, count = 0; i < simply.length(); i++) {
            if (simply.charAt(i) == 'o') {
                count++;
            }
            if (count == 2) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void ex4() {
        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг
        HornsAndHooves hornsAndHooves = new HornsAndHooves();
        double profitAfterTaxes = hornsAndHooves.profitAfterTaxes(2000, 8511, 6988);

        System.out.println(profitAfterTaxes);
    }
}
