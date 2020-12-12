import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Ryan");
        people[1] = new Person("Ethan");
        people[2] = new Person("Elvira");
//        for (Person peep : people) {
//            System.out.println((peep.getName()));
//        }
            people = addPerson(people, new Person("Connor"));
        for (Person student : people){
            System.out.println(student.getName());
        }
    }

    public static Person[] addPerson(Person[] people,Person ind) {
            Person[] newArray = Arrays.copyOf(people, 4);
            newArray[3] = ind;
            return newArray;
            }

}
