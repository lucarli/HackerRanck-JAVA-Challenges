//HackerRank Java If-Else challenge
//Author: Luciano Carli Moreira de Andrade

//In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.

//Task
//Given an integer, n, perform the following conditional actions:

//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5, print Not Weird
//If n is even and in the inclusive range of 6 to 20, print Weird
//If n is even and greater than 20, print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.

//Input Format

//A single line containing a positive integer, .

//Constraints

//1 <= n <= 100

//Output Format

//Print Weird if the number is weird; otherwise, print Not Weird.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Weird{

    public String isWeird(int n){

        if (n%2!=0) {
			return  "Weird";
        }
            else if (n>=2 && n<=5)  {
            return "Not Weird";
        }
            else if (n>=6 && n<=20){
            return "Weird";
        }
        else if (n>20){
            return "Not Weird";
        }
        else return null;
    }
}

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(new Weird().isWeird(N));

        scanner.close();
    }
}
