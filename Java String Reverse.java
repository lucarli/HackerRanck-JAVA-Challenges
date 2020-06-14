//Hackerrank Java String Reverse challenge
//Author: Luciano Carli Moreira de Andrade

//Given a string A, print Yes if it is a palindrome, print No otherwise.

//Constraints

//A will consist at most 50 lower case english letters.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        String reverse = "";

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        for (int i = A.length() - 1; i >= 0; i--)  
            reverse = reverse + A.charAt(i);

        if (A.equals(reverse))  
            System.out.println("Yes");  
        else  
            System.out.println("No");
        
    }
}

