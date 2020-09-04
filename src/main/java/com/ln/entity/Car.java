package com.ln.entity;

import java.util.HashMap;

public class Car {
    private String name;
    private Integer speed;

    public Car(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        //1)
        Car c1 = new Car("奥托", 100);
        Car c2 = new Car("宝马", 200);
        Car c3 = new Car("奔驰", 300);


        //2)
        HashMap<Car, Double> m1 = new HashMap<>();
        m1.put(c1,10000.0);
        m1.put(c2,500000.0);
        m1.put(c3,2000000.0);

        //3)
        for (Car car:m1.keySet()){
            System.out.println(car.getName());
        }

        //4)
        for (Car car:m1.keySet()){
            if (car.getName().equals("宝马")){
                System.out.println(m1.get(car));
            }
        }

        //5)

        for (Car car:m1.keySet()){
            m1.put(car,m1.get(car)*0.80);
        }
        for (Car car:m1.keySet()){
            if (car.getName().equals("宝马")){
                System.out.println("宝马"+m1.get(car));
            }
        }
    }
}
