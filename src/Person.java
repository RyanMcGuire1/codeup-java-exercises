public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name + " says hello!");
    }

    public Person(String name) {
        this.name = name;
    }
public static void main (String[] args){
    Person p1 = new Person("Ryan");
    p1.sayHello();
}
}


