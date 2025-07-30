package com.java.expense;

import java.time.LocalDate;

public class Expense {
    private double amount;
    private String category;
    private String description;
    private String date;

    public void setAmount(double amount){
        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getCategory(){
        return category;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

    public void setDate(String date){
        this.date=date;
    }

    public String getDate(){
        return date;
    }
}
