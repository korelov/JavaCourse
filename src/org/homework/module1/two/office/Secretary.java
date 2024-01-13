package org.homework.module1.two.office;

public class Secretary {
    public void say(Boss boss, Manager manager, Security security) {
        System.out.printf("%s не волнуйтесь, %s все успеет. %s - подождите!\n",
                boss.getName(), manager.getName(), security.getName());
    }
}
