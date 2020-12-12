package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);


//    public String getString(){
//        return sc.nextLine();
//    }
//    public String getString(String ){
//        return sc.nextLine();
//    }

    public boolean yesNo(){
        String yesNo =sc.nextLine();
        if(yesNo.equalsIgnoreCase("y")){
            return true;
        } else if(yesNo.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
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
