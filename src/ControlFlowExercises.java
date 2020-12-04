import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //       int i = 5;
        //       while (i <= 15){
        //           System.out.print(i + " ");
        //           i++;
        //       }

        //       long two = 2L;
        ////       int squared = two * two;
        //        do{
        //            System.out.println(two);
        //            two *= two;
        //        }
        //        while(two <= 1000000L);

            for(long i = 2L; i <= 1000000; i *= i ){
            System.out.println(i);
            }
        int i = 0;
        for (i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        Scanner userInput = new Scanner(System.in);
            boolean userContinues = true;
            do {
                System.out.print("What number would you like to go up to?");
                int userInt = userInput.nextInt();
                System.out.println();
                System.out.println("Here is your table!");
                System.out.println();
                System.out.println("Number | Squared | Cubed");
                System.out.println("------ | ------- | ------");
                for (i = 1; i <= userInt; i++) {
                    System.out.printf("%-7d", i);
                    System.out.print("|");
                    System.out.printf(" %-8d", i * i);
                    System.out.print("|");
                    System.out.printf(" %-9d", i * i *i);
                    System.out.println();
                }
                System.out.print("Would you like to enter another number (y/n)?");
                String userResponse = userInput.next();
                if (!userResponse.equalsIgnoreCase("y")) {
                    userContinues = false;
                }
            }while (userContinues);

            boolean anotherGrade = true;
            do {
                System.out.print("Please enter a numerical grade from 0 tp 100");
                int numericGrade = userInput.nextInt();
                if(numericGrade >= 88){
                    System.out.println("You made an A");
                } else if(numericGrade >= 80) {
                    System.out.println("You made a B");
                } else if(numericGrade >= 67){
                    System.out.println("You made a C");
                } else if(numericGrade >= 60){
                    System.out.println("You made a D");
                } else {
                    System.out.println("You made an F");
                }
                System.out.print("Do you wish to enter a new grade? (y/n)");
                String userResponse = userInput.next();
                if (!userResponse.equalsIgnoreCase("y")){
                    anotherGrade = false;
                }
            } while (anotherGrade);


        }

    }



