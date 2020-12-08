import java.util.Scanner;

public class MethodsExercise {
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int minus(int num1, int num2){
        return num1 - num2;
    }
    public static int divide(int num1, int num2){
        return num1 / num2;
    }
    public static int times(int num1, int num2){
        return num1 * num2;
    }
    public static int modulus(int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10");
        int userNumber = 0;
        Scanner scan = new Scanner(System.in);
        while (true){
            userNumber = scan.nextInt();
            if(userNumber < min){
                System.out.println("To low");
                userNumber = getInteger(min, max);
            } else if(userNumber > max){
                System.out.println("To high");
                userNumber = getInteger(min,max);
            } else {
                System.out.println("within range");
            }
        return userNumber;
        }
    }
    public static long fact(long num){
        for(long i = num - 1; i >= 1; i -= 1){
            num *= i;
        }
        return num;
    }
    public static void main(String[] arg){
        System.out.println(sum(5,4));
        System.out.println(minus(6,3));
        System.out.println(divide(6,5));
        System.out.println(times(2,9));
        System.out.println(modulus(3,7));
        getInteger(1, 10);
        System.out.println("Please enter a number from 1 to 20.");
        Scanner sc = new Scanner(System.in);
        long userInput = sc.nextInt();
        System.out.printf("the factorial of %d is %d.",userInput,fact(userInput));
        System.out.println(" Would you like to continue?");
        String userAnswer = sc.nextLine();
    }
}
