import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter continous assessment score: ");
        int score = sc.nextInt();
        System.out.print("Enter attendance percentage:");
        double attendance = sc.nextDouble();

        if (attendance >= 75) {
            if (score >= 40) {
                System.out.println("Qualified to write the examination.");
            } else {
                System.out.println("Not qualified to write the examination. Your score is below 40."); 
            }
         } else {
System.out.println("Not qualified to write exam (attendance below 75%).");
            }
            sc.close();
        }
    }