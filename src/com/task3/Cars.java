package com.task3;


    public class Cars {
        private int id;
        private String brend;
        private String model;
        private int year;
        private String color;
        private int price;
        private int number;
        public Cars (int id, String brend, String model, int year, String color, int price,  int number){
            this.id = id;
            this.brend = brend;
            this.model = model;
            this.year = year;
            this.color = color;
            this.price = price;
            this.number = number;
        }
        public int getId()
        {
            return id;
        }
        public String getBrend()
        {
            return brend;
        }
        public String getModel()
        {
            return model;
        }
        public int getYear()
        {
            return year;
        }
        public String getColor()
        {
            return color;
        }
        public int getPrice()
        {
            return price;
        }
        public int getNumber()
        {
            return number;
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public void setBrend(String brend)
        {
            this.brend = brend;
        }
        public void setModel(String model)
        {
            this.model = model;
        }
        public void setYear(int year)
        {
            this.year = year;
        }
        public void setColor(String color)
        {
            this.color = color;
        }
        public void setPrice(int price)
        {
            this.price = price;
        }
        public void setNumber(int number)
        {
            this.number = number;
        }
        public String toString()
        {
            return "Id = " + id + " Brend = "  + brend  + " Model = " + model + " year = " + year + " color = " + color + " price = " + price + " number = " + number;
        }
    }


