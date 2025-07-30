package com.java.expense;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExpenseManager implements ExpenseOperations{
    ArrayList<Double> amounts;
    ArrayList<String> categories;
    ArrayList<String> descriptions;
    ArrayList<String> dates;
    Expense e=new Expense();

    ExpenseManager(){
        amounts=new ArrayList<>();
        categories=new ArrayList<>();
        descriptions=new ArrayList<>();
        dates=new ArrayList<>();
    }

    @Override
    public void addExpense(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount:");
        e.setAmount(sc.nextDouble());
        sc.nextLine();
        amounts.add(e.getAmount());
        System.out.println("Enter Category of Expense:");
        e.setCategory(sc.nextLine());
        categories.add(e.getCategory());
        System.out.println("Enter Description of Expense:");
        e.setDescription(sc.nextLine());
        descriptions.add(e.getDescription());
        System.out.println("Enter Date (DD/MM/YYYY):");
        e.setDate(sc.nextLine());
        dates.add(e.getDate());
    }

    @Override
    public void viewAllExpenses(){
        for(int i=0;i<amounts.size();i++){
            System.out.println("₹"+amounts.get(i)+" | "+categories.get(i)+" | "+descriptions.get(i)+" | "+dates.get(i));
        }
    }

    @Override
    public void viewExpensesByCategory(){
        Set<String> categes=new HashSet<>(categories);
        System.out.println("Categories available: "+categes);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Category:");
        String inputCategory=sc.nextLine();
        for(int i=0;i<amounts.size();i++){
            if(inputCategory.toLowerCase().equals(categories.get(i).toLowerCase())){
                System.out.println(amounts.get(i)+" | "+categories.get(i)+" | "+descriptions.get(i)+" | "+dates.get(i));
            }
        }

    }

    @Override
    public void viewTotalExpense(){
        double sum=0;
        for(int i=0;i<amounts.size();i++){
            sum+=amounts.get(i);
        }
        System.out.println("Total Expense: ₹"+sum);
    }

    @Override
    public void generateReport(){
        System.out.println("---- Expense Report ----");
        viewTotalExpense();
        System.out.println("Total Entries: "+amounts.size());
        double highest= amounts.get(0);
        for(int i=0;i< amounts.size();i++){
            if(amounts.get(i)>highest){
                highest= amounts.get(i);
            }
        }
        System.out.println("Highest Expense: ₹"+highest);
    }

}
