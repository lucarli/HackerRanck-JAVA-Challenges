//HackerRank Java Lambda Expressions challenge
//Author: Luciano Carli Moreira de Andrade

//This Java 8 challenge tests your knowledge of Lambda expressions!

//Write the following methods that return a lambda expression performing a specified action:

//PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
//PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
//PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.

//Input Format

//Input is handled for you by the locked stub code in your editor.

//Output Format

//The locked stub code in your editor will print T lines of output.

import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}

class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

    public PerformOperation isOdd() {

        return (num) -> num % 2 != 0;

    };

    public PerformOperation isPrime() {

        return (num) -> {
                for(int i = 2; i <= num/2; ++i){
                    // condition for nonprime number
                    if(num % i == 0)
                    {
                        return false;
                    }
                }
                return true;
                };
    };
    
    public PerformOperation isPalindrome() {
        
        return (num) -> {

                int r = 0, m, o;

                o = num;

                // reversed integer is stored in variable 
                while( num != 0 ){
                    m = num % 10;
                    r = r * 10 + m;
                    num  /= 10;
                }

                // palindrome if o and r are equal
                if (o == r)
                return true;
                else
                    return false;

        };
        
    }
}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }

 