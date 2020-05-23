//Hackerrank Java Priority Queue challenge
//Author: Luciano Carli Moreira de Andrade

//In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

//In this problem we will test your knowledge on Java Priority Queue.

//There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

//ENTER: A student with some priority enters the queue to be served.
//SERVED: The student with the highest priority is served (removed) from the queue.
//A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

//The student having the highest Cumulative Grade Point Average (CGPA) is served first.
//Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
//Any students having the same CGPA and name will be served in ascending order of the id.
//Create the following two classes:

//The Student class should implement:
//The constructor Student(int id, String name, double cgpa).
//The method int getID() to return the id of the student.
//The method String getName() to return the name of the student.
//The method double getCGPA() to return the CGPA of the student.
//The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the //priority order.

//Input Format

//The first line contains an integer, n, describing the total number of events. Each of the  subsequent lines will be of the following two forms:

//ENTER name CGPA id: The student to be inserted into the priority queue.
//SERVED: The highest priority student in the queue was served.
//The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities classes implementation.

//Constraints

//2 <= n <= 1000
//0 <= CGPA <= 4.00
//1 <= id <= 10^5
//2 <= |Name| <= 30

//Output Format

//The locked stub code prints the names of the students yet to be served in the priority order. If there are no such student, then the code prints EMPTY.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
   int id;
   String name;
   double cgpa;

   // Following is the constructor
    Student(int id, String name, double cgpa){

        this.id = id;
        this.name = name;
        this.cgpa = cgpa;

    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPA(){
        return cgpa;
    }

}

class Priorities{

    public static List<Student> sortStudents(List<Student> students){
        Student temp;
        for (int i = 1; i < students.size() ; i++) {
            for (int j = i; j > 0; j--) {
                if (students.get(j).getCGPA() > students.get(j - 1).getCGPA()) {
                    temp = students.get(j);
                    students.set(j,students.get(j - 1));
                    students.set(j - 1,temp);
                }
                if (students.get(j).getCGPA() == students.get(j - 1).getCGPA()) {
                   if (students.get(j).getName().compareTo(students.get(j - 1).getName())<0){
                        temp = students.get(j);
                        students.set(j,students.get(j - 1));
                        students.set(j - 1,temp);
                    }
                   if (students.get(j).getName().compareTo(students.get(j - 1).getName())==0){
                       if (students.get(j).getID() < students.get(j - 1).getID()){
                            temp = students.get(j);
                            students.set(j,students.get(j - 1));
                            students.set(j - 1,temp);
                       }

                    }
                }
            }
        }
    return students;
    }

    List<Student> getStudents(List<String> events){

        List<Student> students = new ArrayList<>();

        for (String ev: events) {

            String[] parts = ev.split(" ");

            if (parts[0].equals("ENTER")){

                students.add(new Student(Integer.parseInt(parts[3]), parts[1], Float.parseFloat(parts[2])));

            }

            students = sortStudents(students);

            if (parts[0].equals("SERVED") && !students.isEmpty()) {

                students.remove(0);

            }


        }

    return students;

    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

