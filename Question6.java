import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. computer science");
        System.out.println("2. cyber security");
        System.out.println("3. software engineering");
        System.out.println("4. information technology");
        System.out.print("Enter a number between 1 and 4: ");
        int choice = sc.nextInt();

     switch (choice) {
         case 1:

            System.out.println("computer science");
            break;
         case 2:

            System.out.println("cyber security");
            break;
         case 3:

            System.out.println("software engineering");
            break;
        case 4:
            System.out.println("information technology");
            break;
         default:
            System.out.println("Invalid selection. ");          

        }
        sc.close();
    }
}