package Revision;

public class Student {

    private String name;

    public Student() {
        this.name = "Error, name didn't set!";
    }

    public Student(String bootcampName) {
        this.name = bootcampName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {//this set is only for empty constructor
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
}
}
