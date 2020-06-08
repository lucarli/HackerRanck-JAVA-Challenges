//Hackerrank Java End-of-file challenge
//Author: Luciano Carli Moreira de Andrade

//The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

//Hint: Java's Scanner.hasNext() method is helpful for this problem.

//Input Format

//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

//Output Format

//For each line, print the line number, followed by a single space, and then the line content received as input.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 1;
        while(scan.hasNext()){
            System.out.println(count++ + " " + scan.nextLine());
        } 

    }
}
