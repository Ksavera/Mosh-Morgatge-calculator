package com.KAcodingbegining;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // M - monthly payment
        // P - is your principal (loan)
        // r is your monthly interest rate, calculated by dividing your annual interest rate by 12. r= x/12/100
        // n is your number of payments (the number of months you will be paying the loan)

        byte monthsInYear = 12;
        byte percent = 100;

        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Period (Years): ");
        byte periodYears = scanner.nextByte();

        // r is your monthly interest rate, calculated by dividing your annual interest rate by 12. r= x/12/100
        double r = annualInterestRate/monthsInYear/percent;
        //System.out.println("monthly rate: "+ r);
        // n is your number of payments (the number of months you will be paying the loan)
        int n = periodYears*monthsInYear;
        //System.out.println("number of payments: "+n);
        // v= formules dalis isnesta, kad nebutu griozdo;
        //double v = Math.pow(r+1,n);
        //System.out.println("formules dalis: "+v);
        //double m = principal*((v*r)/(v-1));

        double m = (principal*(Math.pow(r+1,n))*r/((Math.pow(r+1,n)-1)));


        String result = NumberFormat.getCurrencyInstance().format(m);
        System.out.print("Mortgage: " + result);




    }
}
