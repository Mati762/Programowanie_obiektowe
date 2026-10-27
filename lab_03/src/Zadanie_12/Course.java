package Zadanie_12;

public class Course {
    private String name;
    private int maxStudents;
    private static int numberOfCreatedCourses = 0;
    public static final int DEFAULT_MAX_STUDENTS = 30;

    public Course(String name, int maxStudents) {
        if (name == null) {
            throw new IllegalArgumentException("Nazwa kursu nie może być pusta.");
        }
        if (maxStudents <= 0) {
            throw new IllegalArgumentException("Limit studentów musi być większy od 0.");
        }
        this.name = name;
        this.maxStudents = maxStudents;
        numberOfCreatedCourses++;
    }

    public Course(String name) {
        this(name, DEFAULT_MAX_STUDENTS);
    }

    public String getName() {
        return name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < this.maxStudents) {
            throw new IllegalArgumentException("Nowy limit nie może być mniejszy niż obecny.");
        }
        this.maxStudents = maxStudents;
    }
}