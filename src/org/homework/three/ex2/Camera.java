package org.homework.three.ex2;

public class Camera {

    private final String name;

    private final int zoom;

    private boolean isFlash;

    public Camera(String name, int zoom) {
        this.name = name;
        this.zoom = zoom;
    }

    public Camera(String name, int zoom, boolean isFlash) {
        this(name, zoom);
        this.isFlash = isFlash;
    }

    public String printInfo() {
        if (isFlash) {
            return String.format("производитель %s(%dx zoom)", name, zoom);
        } else {
            return String.format("производитель %s(%dx zoom) есть вспышка", name, zoom);
        }
    }
}
