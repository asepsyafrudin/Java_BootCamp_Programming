package co.g2academy.array;

import co.g2academy.basic.MyDate;

public class ArrayiInitialization {
    private String[] names;
    private String[] simpleNames = {"Georgiana", "Jen", "Simon"};

    private MyDate[] dates;
    private MyDate[] simpleMyDate = {
            new MyDate(22, 7, 2020),
            new MyDate(19, 8, 2020),
            new MyDate(20, 7, 2020) };

    public ArrayiInitialization () {
        names = new String[3];
        names[0] = "Georgiana";
        names[1] = "Jen";
        names[2] = "Simon";

        dates = new MyDate[3];
        dates[0] = new MyDate(22,7,2020);
        dates[1] = new MyDate(19,8, 2020);
        dates[2] = new MyDate(20,7,2020);
    }

    public String[] getName() {
        return this.names;
    }

    public String[] getSimpleName() {
        return this.simpleNames;
    }


    public MyDate[] getMyDate() {
        return this.dates;
    }

    public MyDate[] getSimpleMyDate() {
        return simpleMyDate;
    }
}




