package employee;

public class Employee {
    String name;
    String positions;
    int salary;

    public Employee(String name, String positions, int salary) {
        this.name = name;
        this.positions = positions;
        this.salary = salary;
    }
    String information(int mon){
         return this.name + this.positions + mon * this.salary + "get for last " + mon + " months";
    }
}
