//Hackerrank Java Subarray challenge

//Author: Luciano Carli Moreira de Andrade


//We define the following:

//A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. For example, if array = [1,2,3], then the subarrays are [1], [2], [3], [1,2], [2.3], and [1,2,3]. Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
//The sum of an array is the total sum of its elements.
//An array's sum is negative if the total sum of its elements is negative.
//An array's sum is positive if the total sum of its elements is positive.
//Given an array of n integers, find and print its number of negative subarrays on a new line.

//Input Format

//The first line contains a single integer, n, denoting the length of array A = [a0, a1, ..., an-1].
//The second line contains n space-separated integers describing each respective element, ai, in array A.

//Constraints

//1 <= n <= 100
//-10^4 <= ai <= 10^4

//Output Format

//Print the number of subarrays of A having negative sums.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int sum(int arr[])
        {
            int sum = 0;

            for(int i = 0; i < arr.length; i++)
            {
                sum += arr[i];
            }
            return sum;
        }    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] A = new int[n];
        
        for (int i = 0; i < n; i++){
            A[i] = scan.nextInt();
        }
        scan.close();
        
        int B[];
        int sum;
        int neg = 0;
        
        for (int i = 0; i <= A.length; i++){
            for (int j = i + 1; j <= A.length; j++){

                B = Arrays.copyOfRange(A, i, j); 
                
                if (sum(B) < 0) {
                    neg++;
                }
            }
        }
        
    System.out.println(neg);
            
    }
}


