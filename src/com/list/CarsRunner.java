package com.list;

import java.util.Arrays;
import java.util.List;

public class CarsRunner {
    public static void main(String[] args) {

        Cars car1 = new Cars(1, "BMW", "седан", 2002, "blue", 100000, 111);
        Cars car2 = new Cars(2, "Лада", "седан", 2005, "red", 50000, 112);
        Cars car3 = new Cars(3, "Mercedes", "седан", 2010, "white", 1250000, 113);
        Cars car4 = new Cars(4, "BMW", "седан", 2010, "black", 150000, 114);
        Cars car5 = new Cars(5, "Волга", "седан", 2010, "red", 70000, 115);


        List<Cars> cars = Arrays.asList(car1, car2, car3, car3, car4, car5);
        System.out.println("Машины бренда BMW");
        List<Cars> carsBrend = CarsMethods.carsBrendEqual(cars, "BMW");
        for (Cars car : carsBrend) {
            System.out.println(car.toString());
        }
        System.out.println("Седаны со сроком эксплуатации более 10 лет");
        List<Cars> carsExpluatation = CarsMethods.carsModelExpluatation(cars, "седан", 10);
        for (Cars car : carsExpluatation) {
            System.out.println(car.toString());
        }

        System.out.println("Машины 2010 года со стоимостью более 70000");
        List<Cars> carsYearPrice = CarsMethods.carsYearPrice(cars, 2010, 70000);
        for (Cars car : carsYearPrice) {
            System.out.println(car.toString());
        }
    }
}
