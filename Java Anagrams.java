//Hackerrank Java Anagrams challenge
//Author: Luciano Carli Moreira de Andrade

//Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

//Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

//Input Format

//The first line contains a string denoting a.

//The second line contains a string denoting b.

//Constraints

//. 1<=length(a),length(b)<=50
//.Strings a and b consist of English alphabetic characters.
//.The comparison should NOT be case sensitive.

//Output Format

//Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

import java.util.Scanner;

public class Solution {

    private static int countOccurences(String someString, char searchedChar, int index) {

        if (index >= someString.length()) {
            return 0;
        }
        
        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        
        return count + countOccurences(someString, searchedChar, index + 1);
    }

    static boolean isAnagram(String a, String b) {

        char arr[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        char[][] count = new char[arr.length][2];
        char[][] count2 = new char[arr2.length][2];
        boolean found =false;

        int i = 0;       
        for(char c: arr){
            count[i][0] = Character.toUpperCase(c);
            count[i][1] = (char) (countOccurences(a, c, 0) + '0');
            i++;
        }

        int j = 0;       
        for(char c: arr2){
            count2[j][0] = Character.toUpperCase(c);
            count2[j][1] = (char) (countOccurences(b, c, 0) + '0');
            j++;
        }

        if (i!=j) return found;

        for (int k=0; k < i;k++){
            found = false;
            for(int l=0; l < j; l++){
                if (count[k][0]==count2[l][0] && count[k][1]==count2[l][1]){
                    found = true;
                    break;
                }
            }


        }

    return found;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


