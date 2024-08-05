package Students;

public class Student {
    private  String name;
    private  int grade;
    private String[] courses;
    private int numberCourses;


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[1];
        this.numberCourses = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String[] getCourses() {
        return courses;
    }

    public int getNumberOfCourses() {
        return numberCourses;
    }

    public void incrementNumberOfCourses() {
        this.numberCourses++;
    }

    public void setCourse(int index, String course) {
        this.courses[index] = course;
    }
    public void resizeCoursesArray() {
        String[] newCourses = new String[courses.length + 1];
        System.arraycopy(courses, 0, newCourses, 0, courses.length);
        courses = newCourses;
    }
    @Override
    public String toString() {
        StringBuilder coursesList = new StringBuilder();
        for (int i = 0; i < numberCourses; i++) {
            coursesList.append(courses[i]);
            if (i < numberCourses - 1) {
                coursesList.append(", ");
            }
        }
        return "Name: " + name + ", Grade: " + grade + ", Courses: " + coursesList.toString();
    }
}
