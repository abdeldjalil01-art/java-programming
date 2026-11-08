import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        String result = (a == b) ?
        "Both numbers are equal."
        : "The greater nember is " + ((a > b) ? a : b);
        System.out.println(result);
        sc.close();
    }
}
