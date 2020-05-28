

//The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, //HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

//You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

//For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.

//Input Format

//A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

//Constraints

//2000 < year < 3000

//Output Format

//Output the correct day in capital letters.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.*;

class Result {

    public static String findDay(int month, int day, int year) {

        DayOfWeek dow = LocalDate.of(year,month,day).getDayOfWeek();
        return String.valueOf(dow);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


