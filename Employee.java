package Revision;

public class Employee {
    //instance variables for id, name, position, department, company, salary
    private int id, salary;
    private String name, position, department, company;

    //constructor with 4 params, except id and department
    //inside the constructor generate a random number between 1 and 100 as ID number
    //inside the constructor provide a message for department "Department not yet assigned";
    public Employee(String n, String pos, int sal, String comp) {
        this.name = n;
        this.position = pos;
        this.salary = sal;
        this.company = comp;
        this.id = (int) ((Math.random() * 100) + 1);
        this.department = "Department not yet assigned";
    }

    //declare set get Methods for department, position, salary
    //setMethods
    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //getMethods
    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
    public int getId(){
      return id;
    }

    //Override all toString method for better explanation about our object

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
