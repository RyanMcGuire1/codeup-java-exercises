import java.util.Scanner;

public class Bob {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
//        System.out.println("Bob's kid says:");
        if(userInput.endsWith("?")){
            System.out.println("Sure");
        } else if(userInput.endsWith("!")){
            System.out.println("WHoa, chill out!");
        } else if(userInput.equalsIgnoreCase("")){
            System.out.println("Fine. Be that way!");
        } else{
            System.out.println("Whatever");
        }

    }
}
