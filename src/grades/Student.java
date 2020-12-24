package grades;

import java.util.ArrayList;

public class Student {
    private String Name;
    private ArrayList<Double> grades;

    // returns the student's name
    public String getName() {
        return Name;
    }

    // adds the given grade to the grades property
    public void addGrade(Double grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
            avg = sum / grades.size();
        }
        return avg;
    }

    public Student(String Name) {
        this.Name = Name;
        this.grades = new ArrayList<>();

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ryan");
         st1.addGrade(90.0);
         st1.addGrade(50.0);
         System.out.println(st1.getGradeAverage());
    }
}
