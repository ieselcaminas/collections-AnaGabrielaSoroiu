package Ordenacion;

public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private double salario;

    public Human(String firstName, String lastName, double salario) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salario = salario;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.salario;
    }

    @Override
    public int compareTo (Human human) {
        if (this.salario == human.getSalario()) {
            return 0;
        } else if (this.salario > human.getSalario()) {
            return 1;
        } else {
            return -1;
        }
    }
}
