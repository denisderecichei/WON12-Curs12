package org.fasttrack.curs12.random;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car() {
    }

    class Engine {
        private int capacity;
        private int consumption;

        public Engine(int capacity, int consumption) {
            this.capacity = capacity;
            this.consumption = consumption;
            System.out.println("leak " + brand);
        }

        public String getGrand() {
            return brand;
        }

        public Engine() {
        }
    }

    static class Whatever {

    }
}
