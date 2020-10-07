package com.task3;

public class CarsMethods {
    public static Cars[] carsBrendEqual (Cars[] cars, String brend) {

        int k = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrend().equalsIgnoreCase(brend)) {
                k++;
            }
        }
        Cars[] cars2 = new Cars[k];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrend().equalsIgnoreCase(brend)) {
                try {

                    cars2[j] = cars[i].clone();
                    j++;
                } catch (CloneNotSupportedException ex) {

                    System.out.println("Clonable not implemented");
                }
            }


        }
        return cars2;
    }
    public static Cars[] carsModelExpluatation (Cars[] cars, String model, int years)
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        int year = calendar.get(java.util.Calendar.YEAR);
        int k = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equalsIgnoreCase(model) && year - cars[i].getYear() == years) {
                k++;
            }
        }
        Cars[] cars2 = new Cars[k];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equalsIgnoreCase(model) && year - cars[i].getYear() == years) {
                try {
                    cars2[j] = cars[i].clone();
                    j++;
                } catch (CloneNotSupportedException ex) {

                    System.out.println("Clonable not implemented");
                }
            }


        }
        return cars2;
    }

    public static Cars[] carsYearPrice (Cars[] cars, int year, int price)
    {
        int k = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == year && cars[i].getPrice() > price ) {
                k++;
            }
        }
        Cars[] cars2 = new Cars[k];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == year && cars[i].getPrice() > price ) {
                try {

                    cars2[j] = cars[i].clone();
                    j++;
                } catch (CloneNotSupportedException ex) {

                    System.out.println("Clonable not implemented");
                }
            }


        }
        return cars2;
    }
}