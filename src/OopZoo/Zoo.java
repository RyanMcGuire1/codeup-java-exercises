package OopZoo;

public class Zoo {

    public static void main(String[] args) {
//        animal animal1 = new animal(12, "male", 5);
//
//        animal1.eat();
//        animal1.sleep();

        Fish seaBass = new Fish(20, "female", 200);
//        seaBass.eat();
//        seaBass.sleep();
//        seaBass.swim();


//        Bird bird1 = new Bird(38, "Female", 3 );
//        bird1.eat();
//        bird1.sleep();
//        bird1.fly();
    Macaw blueMacaw = new Macaw(35, "Female", 3);
////    blueMacaw.eat();
////    blueMacaw.sleep();
////    blueMacaw.fly();
        blueMacaw.move();
        seaBass.move();
    }


}
