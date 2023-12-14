package org.homework.three.ex2;

public abstract class Phone {

    protected String model;

    protected String operationSystem;

    protected Motherboard motherboard;

    protected Camera camera;

    public void printInfo() {
        if (operationSystem != null && motherboard != null && camera != null) {
            System.out.printf("""
                            Тип телефона: %s\s
                            Опереционная система: %s\s
                            Материнская плата: %s\s
                            Камера: %s\s
                            """,
                    this.model, this.operationSystem,
                    this.motherboard.printInfo(), this.camera.printInfo());
        } else {
            System.out.println("Тип телефона: " + this.model);
        }
    }
}
