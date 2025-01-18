import CalculateAreaAndPerimeter.Circle;
import CalculateAreaAndPerimeter.Rectangle;
import CalculateAreaAndPerimeter.Square;
import CalculateAreaAndPerimeter.Triangles.EquilateralTriangle;
import JalaUniversityStudents.University;
import JalaUniversityStudents.Student;

import static LastFactorialDigit.LastFactorialDigit.getFactorial;
import static QuadrantSelection.QuadrantSelection.getQuadrant;

public class main {
    public static void main(String[] args) {

        University jalaUniversity = new University();
        jalaUniversity.addStudent(new Student("Raul", 2, new String[]{"Maths", "Science"}));
        jalaUniversity.addStudent(new Student("Sara", 3, new String[]{"Science"}));
        jalaUniversity.addStudent(new Student("Luis", 3, new String[]{"Maths", "Science"}));
        jalaUniversity.addStudent(new Student("Liz", 2, new String[]{"Science"}));

        jalaUniversity.addStudent(new Student("Gery", 1, new String[]{"Induction"}));

        jalaUniversity.assignCourseToStudent(3, "Database I");

        jalaUniversity.promoteStudent(2);

        System.out.print("Science students: ");
        jalaUniversity.filter("Science");
        System.out.println();

        jalaUniversity.showAllStudents();







//        getQuadrant();
//        getFactorial();
//        Circle circle1 = new Circle(5);
//        circle1.showInfo();
//        Rectangle rectangle1 = new Rectangle(15,7);
//        rectangle1.showInfo();
//        EquilateralTriangle triangle1 = new EquilateralTriangle(7);
//        triangle1.showInfo();
//        Square square1 = new Square(2, 2);
//        square1.showInfo();
    }
}
