package models;

public class Student {
    private String name;
    private String title;

    // constructor con dos parametros str
    public Student(String name, String title) {
        this.name = name;
        this.title = title;
    }

    // constructor con un parametros str
    public Student(String name) {
        this.name = name;
        this.title = "Student";
    }

    // Setters
    public void setName(final String name) {
        this.name = name;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Welcome " + this.name + " " + this.title;
        // %s == String
        // %d == double or int
        // %f == float
        // return System.out.printf("Welcome %s %s", this.name, this.title);
    }
}