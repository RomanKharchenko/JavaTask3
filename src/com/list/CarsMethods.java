package com.list;
import java.util.List;
import java.util.ArrayList;
public class CarsMethods {
    public static List<Cars> carsBrendEqual(List<Cars> cars, String brend) {
        List<Cars> result = new ArrayList<Cars>();
        for (Cars car : cars) {
            if (car.getBrend().equalsIgnoreCase(brend)) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Cars> carsModelExpluatation(List<Cars> cars, String model, int years) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        int year = calendar.get(java.util.Calendar.YEAR);
        ArrayList<Cars> yearCars = new ArrayList<Cars>();
        for (Cars car : cars) {
            if (car.getModel() == "седан" && year - car.getYear() > years) {
                yearCars.add(car);
            }
        }
        return yearCars;
    }

    public static List<Cars> carsYearPrice(List<Cars> cars, int year, int price) {
        ArrayList<Cars> yearPriceCars = new ArrayList<Cars>();
        for (Cars car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                yearPriceCars.add(car);
            }
        }
        return yearPriceCars;
    }
}