package Phase2_training;
import java.util.*;
abstract class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void Bonus_cal();
    abstract void displayAll();
}

class Developer extends Employee {
    public void fullstack() {
        System.out.println("Full Stack Dev");
    }

    public void mernstack() {
        System.out.println("Mern Stack Dev");
    }

    @Override
    public void Bonus_cal() {
        System.out.println((getSalary() * 2.5) / 100);
    }

    @Override
    public void displayAll() {
        System.out.println("Name: " + getName() + "\nSalary: " + getSalary());
    }
}

public class employee1{
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.setName("Badhrish");
        dev.setSalary(200000);

        dev.displayAll();
        dev.fullstack();
        dev.Bonus_cal();
    }
}