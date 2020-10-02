package com.task3;

public class CarsMethods {
    public static void carsBrendEqual (Cars[] cars, String brend)
    {
        for (int i = 0; i<cars.length; i++)
        {
            if (cars[i].getBrend() == brend)
            {
                System.out.println(cars[i].toString());
            }
        }

    }
    public static void carsModelExpluatation (Cars[] cars, String model, int years)
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        int year = calendar.get(java.util.Calendar.YEAR);
        //System.out.println(year - cars[2].getYear());
        for (int i = 0; i<cars.length; i++)
        {
            if (cars[i].getModel() == "седан" && year - cars[i].getYear() == years )
            {
                System.out.println(cars[i].toString());
            }
        }
    }
    public static void carsYearPrice (Cars[] cars, int year, int price)
    {
        //System.out.println(year - cars[2].getYear());
        for (int i = 0; i<cars.length; i++)
        {
            if (cars[i].getYear() == year && cars[i].getPrice() > price )
            {
                System.out.println(cars[i].toString());
            }
        }
    }
}