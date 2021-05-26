package ru.job4j.function;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3Supplier {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("rangeRover", "white", 2));
        System.out.println("my cars: " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 200;
            car.model = "BMW";
            System.out.println("Upgraded car: " + car);
            System.out.println("My cars: " + ourCars);
        });
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model
                + '\''
                + ", color='" + color
                + '\''
                + ", engine=" + engine
                +
                '}';
    }
}