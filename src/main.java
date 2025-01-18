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

        Student gery = new Student("Gery", 1, new String[]{"Induction"});
        jalaUniversity.addStudent(gery);

        Student maria = new Student("Maria", 1, new String[]{"Calculus"});
        jalaUniversity.addStudent(maria);
        maria.addCourse("Databases 1");

        Student juanito = new Student("Juan", 1, new String[]{"Matematicas discretas"});
        jalaUniversity.addStudent(juanito);
        juanito.setGrade(2);
        int gradeJuanito = juanito.getGrade();
        System.out.println(gradeJuanito);

        
        Student luis = new Student("Luis", 1, new String[]{"science"});
        jalaUniversity.addStudent(luis);
        Student raul = new Student("Raul", 2, new String[]{"Maths", "science", "databases 1"});
        jalaUniversity.addStudent(raul);
        Student liz = new Student("Liz", 1, new String[]{"science"});
        jalaUniversity.addStudent(liz);
        System.out.println();
        System.out.print("Science students: ");
        jalaUniversity.filter("science");
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
