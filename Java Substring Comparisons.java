/*
//Hackerrank Java Substring Comparisons

//Author: Luciano Carli Moreira de Andrade

We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

	A < B < ..... < Y < Z < a < b < ... < y < z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints

 1 <= |s| <= 1000
 s consists of English alphabetic letters only (i.e., [a-zA-Z]).

*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String[] subs = new String[s.length() + 1 - k];
        
        int ind = 0;
        for (int i = 0, j = k; j <= s.length(); i++, j++) {
                subs[ind] = s.substring(i,j);
                ind++;
        }
        
        for(int i = 0; i<subs.length-1; i++){  
            for (int j = i+1; j<subs.length; j++){  
                if(subs[i].compareTo(subs[j])>0){  
                    String temp = subs[i];  
                    subs[i] = subs[j];  
                    subs[j] = temp;
                }  
            }  
        }
        
        smallest = subs[0];
        largest = subs[subs.length-1];
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}


