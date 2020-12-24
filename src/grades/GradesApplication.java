package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication  {
    public static void main(String[] args) {
    HashMap<String, Student> student = new HashMap<>();
    Student ryan = new Student("Ryan");
    Student bob = new Student("Bob");
    Student joe = new Student("Joe");
    Student kelly = new Student("Kelly");
    ryan.addGrade(100.0);
    ryan.addGrade(90.0);
    ryan.addGrade(80.0);
    bob.addGrade(90.0);
    bob.addGrade(80.0);
    bob.addGrade(70.0);
    joe.addGrade(80.0);
    joe.addGrade(70.0);
    joe.addGrade(60.0);
    kelly.addGrade(70.0);
    kelly.addGrade(60.0);
    kelly.addGrade(50.0);
    student.putIfAbsent("ryanrox",ryan);
    student.putIfAbsent("bobrox",bob);
    student.putIfAbsent("joerox",joe);
    student.putIfAbsent("kellyrox",kelly);
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students");
            System.out.println("|ryanrox| |bobrox| |joerox| |kellyrox|");
        Scanner sc = new Scanner(System.in);
        Boolean userContinues = true;
        do {
            System.out.println("What student would you like more information on?");
           String userName = sc.next();
//           if(userName = student.get(String))


        }while(userContinues);
    }
}
