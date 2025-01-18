package JalaUniversityStudents;

public class Student {
    private String name;
    private int grade;
    private String[] courses;
    private int courseCount;

    public Student(String name, int grade, String[] initialCourses) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[5];
        this.courseCount = 0;

        for (String course : initialCourses) {
            addCourse(course);
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addCourse(String course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("Course limit reached (5 courses max).");
        }
    }

    public void showAllInfo() {
        System.out.println("Name: " + getName() + ", Grade: " + getGrade() + ", Courses: " + String.join(", ", courses));
    }
}
