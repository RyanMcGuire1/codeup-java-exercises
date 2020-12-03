import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n ", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Please enter three words.");
//        String userInput = scanner.nextLine();
////        String userInput2 = scanner.next();
////        String userInput3 = scanner.next();
//        System.out.println(userInput);
//        System.out.println(userInput2);
//        System.out.println(userInput3);

        System.out.println("Please enter a length and width");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();

        int length = Integer.parseInt(userLength);
        int width = Integer.parseInt(userWidth);
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is %d \n", area);
        System.out.printf("The perimeter is %d \n", perimeter);







    }
}
