import Students.Student;
import Students.University;

import java.util.List;

public class main {
    public static void main(String[] args) {
        //getQuadrant();
        //getFactorial();
        //Rectangle rectangle1 = new Rectangle(15,7);
        //rectangle1.showInfo();
        //EquilateralTriangle triangle1 = new EquilateralTriangle(7);
        //triangle1.showInfo();
        //IsoscelesTriangle triangle2 = new IsoscelesTriangle(6,4);
        //triangle2.showInfo();
        //ScaleneTriangle triangle3 = new ScaleneTriangle(4,3,7);
        //triangle3.showInfo();
        //Circle circle1 = new Circle(5);
        //circle1.showInfo();
        //Square square1 = new Square(2, 2);
        //square1.showInfo();

        Student mario = new Student("Mario", 1);
        Student jesus = new Student("Jesus", 2);
        Student abel = new Student("Abel", 1);
        Student bryan = new Student("Bryan", 2);
        Student carlos = new Student("Carlos", 1);
        University jalaUniversity = new University();

        jalaUniversity.addStudent(abel,1, "maths");
        jalaUniversity.addCourse(abel, "maths");
        abel.setGrade(2);
        jalaUniversity.addStudent(bryan,2, "calculus");
        jalaUniversity.addCourse(bryan, "calculus");
        jalaUniversity.addCourse(bryan, "DataBase");
        jalaUniversity.addStudent(carlos,1, "maths");
        jalaUniversity.addCourse(carlos, "maths");
        jalaUniversity.addStudent(mario,3, "programming");
        jalaUniversity.addCourse(mario, "programming");
        jalaUniversity.addStudent(jesus,1, "maths");
        jalaUniversity.addCourse(jesus, "maths");
        jalaUniversity.showStudents();
        List<String> mathsStudents = jalaUniversity.filter("maths");
        System.out.println("Students in maths course: " + mathsStudents);

    }
}
