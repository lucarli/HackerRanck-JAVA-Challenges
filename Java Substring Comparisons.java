//Hackerrank Java Substring Comparisons challenge
//Author: Luciano Carli Moreira de Andrade

//We define the following terms:

//Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

//A < B < ... < Y < Z < a < b < ... < y < Z

//For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

//A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

//Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

//Input Format

//The first line contains a string denoting s.
//The second line contains an integer denoting k.

//Constraints

//1<=|s|<=1000
//s consists of English alphabetic letters only (i.e., [a-zA-Z]).

//Output Format

//Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

import java.util.*;

class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> listStrings = new ArrayList<String>();

        if (k > s.length())
            return null;

        for (int i=0; i<s.length() - k + 1; i++)
            listStrings.add(s.substring(i, i + k));
            
        Collections.sort(listStrings);

        smallest = listStrings.get(0);
        
        largest =  listStrings.get(listStrings.size() - 1);

        return smallest + "\n" + largest;
    }

}


public class Main{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
          
        System.out.println(Solution.getSmallestAndLargest(s, k));
        }
}


