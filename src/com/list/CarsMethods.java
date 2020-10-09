package com.task3;
import java.util.ArrayList;

public class CarsMethods {
    public static ArrayList<Cars> (Cars[] cars, String brend)
    {
        ArrayList<Cars> brendcars = new ArrayList<Car>()
        for (int i = 0; i<cars.length; i++)
        {
            if (cars[i].getBrend() == brend)
            {
                brendcars.add(cars[i])
            }
        }
        return brendcars

    }
    public static void ArrayList<Cars> (Cars[] cars, String model, int years)
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        int year = calendar.get(java.util.Calendar.YEAR);
        ArrayList<Cars> yearcars = new ArrayList<Car>()
        for (int i = 0; i<cars.length; i++)
        {
            if (cars[i].getModel() == "седан" && year - cars[i].getYear() == years )
            {
                yearcars.add(cars[i])
            }
        }
        return yearcars
    }
    public static void ArrayList<Cars> (Cars[] cars, int year, int price)
    {
        ArrayList<Cars> yearpricecars = new ArrayList<Car>()
        for (int i = 0; i<cars.length; i++)
        {
            if (cars[i].getYear() == year && cars[i].getPrice() > price )
            {
                yearpricecars.add(cars[i])
            }
        }
        return yearpricecars
    }
}