import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);
        System.out.print("Enter customer's name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter monthly salary: ");
        double salary =
        sc.nextDouble();

        System.out.println("customer: " + name);
        if (age >= 21 & salary >= 100000) {

            System.out.println("Congratulation you are qualifiy for the loan.");
        } else if (age < 21 && salary < 100000) {
            System.out.println("Sorry you do not qualify: you are under 21 and your salary is below 100,000.");
        } else if ( age < 21) {
            System.out.println("Sorry you do not qualify: you must at least 21 years old.");
        } else{
            System.out.println("Sorry you do not qualify: monthly salary must be at least 100,000.");
        }
        sc.close();
    }
}