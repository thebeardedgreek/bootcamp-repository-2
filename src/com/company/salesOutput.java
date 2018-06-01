package com.company;
import java.util.Scanner;

public class salesOutput {
    public static void main(String[] args) {
        String customerName, taxCode;
        int customerNumber;
        double salesAmount, totalAmount = 0.00;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the Customer Number: ");
        customerNumber = keyboard.nextInt();
        System.out.println("Please enter the Customer Name: ");
        customerName = keyboard.next();
        System.out.println("Please enter the Sales Amount: ");
        salesAmount = keyboard.nextDouble();
        System.out.println("Please enter the Tax Code: ");
        taxCode = keyboard.next();

        if(taxCode.equals("NRM")){
            totalAmount = salesAmount + (salesAmount * 0.06);
        } else if(taxCode.equals("BIZ")){
            totalAmount = salesAmount + (salesAmount * 0.045);
        } else if(taxCode.equals("NPF")) {
            totalAmount = salesAmount;
        }

        System.out.print("Customer ID: " + customerNumber + "\nCustomer Name: " + customerName +
        "\nSales Amount: " + salesAmount + "\nTax Code: " + taxCode + "\nTotal Amount Due: " + totalAmount);
    }
}
