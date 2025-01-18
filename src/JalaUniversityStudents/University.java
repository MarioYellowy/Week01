package JalaUniversityStudents;

public class University {
    private Student[] students;
    private int studentCount;

    public University() {
        this.students = new Student[10];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student added: " + student.getName());
        } else {
            System.out.println("No space available to add more students.");
        }
    }

    public void assignCourseToStudent(int studentIndex, String course) {
        if (studentIndex >= 0 && studentIndex < studentCount) {
            students[studentIndex].addCourse(course);
        } else {
            System.out.println("Invalid student index.");
        }
    }

    public void promoteStudent(int studentIndex) {
        if (studentIndex >= 0 && studentIndex < studentCount) {
            Student student = students[studentIndex];
            student.setGrade(student.getGrade() + 1);
            System.out.println("Student " + student.getName() + " promoted to grade " + student.getGrade());
        } else {
            System.out.println("Invalid student index.");
        }
    }

    public void filter(String course) {
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            for (String studentCourse : student.getCourses()) {
                if (studentCourse != null && studentCourse.equals(course)) {
                    if (found) {
                        System.out.print(", ");
                    }
                    System.out.print(student.getName());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No students found in the course: " + course);
        }
    }

    // Método para mostrar todos los estudiantes con el formato especificado
    public void showAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].showAllInfo();  // Muestra la información de cada estudiante
        }
    }
}
