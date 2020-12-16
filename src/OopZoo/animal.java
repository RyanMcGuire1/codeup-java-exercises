package OopZoo;

public abstract class animal {

    //properties
    protected int age;

    protected String gender;

    protected int weightInLbs;

    public animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    //methods
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();


}
