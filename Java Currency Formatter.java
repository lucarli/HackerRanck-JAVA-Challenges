//Hackerrank Java Currency Formatter challenge
//Author: Luciano Carli Moreira de Andrade

//Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

//US: formattedPayment
//India: formattedPayment
//China: formattedPayment
//France: formattedPayment

//where formattedPayment is payment formatted according to the appropriate Locale's currency.

//Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

//Input Format

//A single double-precision number denoting payment.

//Constraints

//Output Format

//On the first line, print US: u where u is payment formatted for US currency.
//On the second line, print India: i where i is payment formatted for Indian currency.
//On the third line, print China: c where c is payment formatted for Chinese currency.
//On the fourth line, print France: f, where f is payment formatted for French currency.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

