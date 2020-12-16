package OopZoo;

public class Bird extends animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Flapping my wing");
    }


}
