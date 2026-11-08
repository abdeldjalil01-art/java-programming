import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);
        System.out.print("Enter examination score (o-100)");
        double score = sc.nextDouble();
        String grade;
        if(score < 0 || score > 100){
            System.out.println("Invalid score");

        } else {
            if (score >= 70) grade = "A";
            else if (score >= 60) grade = "B";
            else if (score >= 50) grade = "C";
            else if (score >= 45) grade = "D";
            else if (score >= 40) grade = "E";
            else grade = "F";
            System.out.println("Grade:" + grade);
        }
        sc.close();
    }
}
