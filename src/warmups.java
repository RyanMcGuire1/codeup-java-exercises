public class warmups {
//    method to get a cubed number
    public static int cubed(int num){
        return num * num * num;
    }
// method overloading
   public  int arithmetic(int num1, int num2){
        return num1 - num2;
   }
   public  double arithmetic(double num1, double num2){
        return num1 - num2;
   }

    public static void main(String[] args) {
        System.out.println(cubed(5));

    }
}
