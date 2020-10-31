package co.g2academy.basic;

public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public MyDate() {}

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showMyDate() {
        System.out.println(" My Date is : " + day + "-"  + month + "-" + year);
    }

	public void birthday() {
        this.year = this.year + 1;
    }
    
    public void setDay(int day) {
        this.day= day;
    }
}
