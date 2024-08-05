package Students;

import java.util.ArrayList;
import java.util.List;

public class University {
    public Student[] students;
    private int numberStudents;

    public University() {
        this.students = new Student[1];
        this.numberStudents = 0;

    }

    public void setStudent(int index, Student studentName) {
        this.students[index] = studentName;
    }

    public void resizeStudentsArray() {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }
    public void addStudent(Student student, int grade, String course) {
        if (numberStudents == students.length) {
            resizeStudentsArray();
        }
        students[numberStudents] = student;
        numberStudents++;
    }
    public void addCourse(Student student, String course) {
        if (student.getNumberOfCourses() == student.getCourses().length) {
            student.resizeCoursesArray();
        }
        student.setCourse(student.getNumberOfCourses(), course);
        student.incrementNumberOfCourses();
    }

    public void showStudents () {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }
    public List<String> filter(String courseName) {
        List<String> filteredStudents = new ArrayList<>();
        for (int i = 0; i < numberStudents; i++) {
            Student student = students[i];
            for (int j = 0; j < student.getNumberOfCourses(); j++) {
                if (student.getCourses()[j].equalsIgnoreCase(courseName)) {
                    filteredStudents.add(student.getName());
                    break;
                }
            }
        }
        return filteredStudents;
    }

}
