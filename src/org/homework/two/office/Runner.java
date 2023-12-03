package org.homework.two.office;

public class Runner {
    public static void main(String[] args) {

        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretar secretar = new Secretar();

        Office office = new Office(boss, manager, secretar, security);
        office.workDay();
    }
}
