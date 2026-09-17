package com.sunbeam;

import com.sunbeam.*;

class Date {

    // Instance variables
    private int month;
    private int day;
    private int year;

    // Parameterized constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setter for month
    public void setMonth(int month) {
        this.month = month;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Setter for day
    public void setDay(int day) {
        this.day = day;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Display date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}


public class DateTest {

    public static void main(String[] args) {

        // Creating Date object
        Date d1 = new Date(9, 17, 2026);

        // Display date
        d1.displayDate();

        // Testing setters
        d1.setMonth(10);
        d1.setDay(25);
        d1.setYear(2026);

        // Display updated date
        d1.displayDate();

        // Testing getters
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
    }
}


