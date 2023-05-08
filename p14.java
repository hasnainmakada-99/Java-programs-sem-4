import java.util.ArrayList;
import java.util.Date;

public class p14 {
    public static void main(String[] args) {
        // Create an ArrayList of Objects
        ArrayList<Object> myList = new ArrayList<>();

        // Add a Loan object, a Date object, a String, and a Circle object to the list
        Loan loan = new Loan(1000, 2.5, 5);
        Date date = new Date();
        String str = "Hello, World!";
        Circle circle = new Circle(5);

        myList.add(loan);
        myList.add(date);
        myList.add(str);
        myList.add(circle);

        // Use a loop to display all elements in the list by invoking the object's
        // toString() method
        for (Object obj : myList) {
            System.out.println(obj.toString());
        }
    }
}

// Sample classes for Loan and Circle
class Loan {
    private double amount;
    private double interestRate;
    private int years;

    public Loan(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    public String toString() {
        return "Loan amount: " + amount + ", Interest rate: " + interestRate + ", Years: " + years;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle radius: " + radius;
    }
}
