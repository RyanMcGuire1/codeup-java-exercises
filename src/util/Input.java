package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;
    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return this.sc.nextLine();
    }

    public String getString(String prompt){
          System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        return yesNo("Please enter yes or no.");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.sc.next();
        return (input.trim().toLowerCase().equals("y") || input.trim().toLowerCase().equals("yes"));
    }

    public int getInt(){
        System.out.println("Please enter an integer");
        int userInt = sc.nextInt();
        return userInt;
    }
    public int getInt(int min, int max ){
       int userInt = getInt();
       if(userInt >= min && userInt <= max) {
           System.out.println("You are within range");
           return userInt;
       }else{
           System.out.println("you are not within range");
           return getInt(min, max);
       }


    }

    public double getDouble(){
        System.out.println("Please enter an double");
        double userDouble = sc.nextDouble();
        return userDouble;
    }
    public double getDouble(double min, double max ){
        double userDouble = getDouble();
        if(userDouble >= min && userDouble <= max) {
            System.out.println("You are within range");
            return userDouble;
        }else{
            System.out.println("you are not within range");
            return getDouble(min, max);
        }


    }









}
