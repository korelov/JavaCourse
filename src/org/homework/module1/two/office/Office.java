package org.homework.module1.two.office;

public class Office {

    Boss boss;
    Manager manager;
    Secretary secretary;
    Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workDay() {
        boss.say(manager);
        manager.say();
        security.say();
        secretary.say(boss, manager, security);
    }
}
