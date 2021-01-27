package com.example.myapplication.CourseAdapter;

public class Course {
    String name, lastName, textBuy, textSell;

    public Course(String name, String lastName, String textBuy, String textSell) {
        this.name = name;
        this.lastName = lastName;
        this.textBuy = textBuy;
        this.textSell = textSell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTextBuy() {
        return textBuy;
    }

    public String setTextBuy(String textBuy) { return textBuy; }

    public String getTextSell() {
        return textSell;
    }

    public String setTextSell(String textSell) { return textSell; }

}
