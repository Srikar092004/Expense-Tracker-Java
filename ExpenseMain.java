package com.java.expense;

import java.util.Scanner;

public class ExpenseMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ExpenseOperations em=new ExpenseManager();

        for (;;){
            System.out.println("---- Expense Tracker Menu ----");
            System.out.println("1. Add New Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Expenses by Category");
            System.out.println("4. View Total Expense");
            System.out.println("5. Generate Expense Report");
            System.out.println("6. Exit");

            System.out.println("Enter Operation:");
            switch (sc.nextInt()){
                case 1:
                    em.addExpense();
                    System.out.println("Expense Added!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Expenses Added:");
                    em.viewAllExpenses();
                    System.out.println();
                    break;
                case 3:
                    em.viewExpensesByCategory();
                    System.out.println("Operation Complete");
                    System.out.println();
                    break;
                case 4:
                    em.viewTotalExpense();
                    System.out.println("Operation Complete");
                    System.out.println();
                    break;
                case 5:
                    em.generateReport();
                    System.out.println("Report Generated Successfully!");
                    System.out.println();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Enter valid operation");
            }
        }
    }
}
