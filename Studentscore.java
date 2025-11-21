import java.util.Scanner;

public class Studentscore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int score;
        System.out.print("Please enter your score: ");
        score = scanner.nextInt();

        if(score >= 50){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        scanner.close();
    }
}
