//Hackerrank Java String Tokens challenge
//Author: Luciano Carli Moreira de Andrade

//Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

//Note: You may find the String.split method helpful in completing this challenge.

//Input Format

//A single string, s.

//Constraints

//1<=length of s<=4*10^5

//s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

//Output Format

//On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string s.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
  
        StringTokenizer tokens = new StringTokenizer(s, "[ !,?._'@]+");
        
        System.out.println(tokens.countTokens());

        while (tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }

        scan.close();

    }
}

