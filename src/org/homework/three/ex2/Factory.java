package org.homework.three.ex2;

public class Factory {

    public void makePhone(Iphone iphone) {
        iphone.operationSystem = "Ios";
        iphone.motherboard = new Motherboard("7uik", 15, 12, 13);
        iphone.camera = new Camera("iphone", 15, true);
    }

    public void makePhone(Samsung samsung) {
        samsung.operationSystem = "Android";
        samsung.motherboard = new Motherboard("j-108", 10, 12, 13);
        samsung.camera = new Camera("Samsung", 20);
    }
}
