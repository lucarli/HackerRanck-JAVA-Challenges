
//HackerRank Java BigInteger challenge
//Author: Luciano Carli Moreira de Andrade

//In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

//Use the power of Java's BigInteger class and solve this problem.

//Input Format

//There will be two lines containing two numbers, a and b.

//Constraints

//a and b are non-negative integers and can have maximum 200 digits.

//Output Format

//Output two lines. The first line should contain a + b, and the second line should contain a x b. Don't print any leading zeros.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        //Input
        Scanner sc= new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();  
        BigInteger b = sc.nextBigInteger();  
        sc.close();  

        System.out.println(a.add(b));
        System.out.println(a.multiply(b)); 
    }
}



