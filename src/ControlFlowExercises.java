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

//            for(long i = 2L; i <= 1000000; i *= i ){
//            System.out.println(i);
//            }
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
    }
}

