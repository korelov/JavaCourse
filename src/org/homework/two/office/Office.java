package org.homework.two.office;

public class Office {

    Boss boss;
    Manager manager;
    Secretar secretar;
    Security security;

    public Office(Boss boss, Manager manager, Secretar secretar, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretar = secretar;
        this.security = security;
    }

    public void workDay() {
        boss.say();
        manager.say();
        security.say();
        secretar.say();
    }
}
