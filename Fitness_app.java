import java.util.Scanner;
public class Fitness_app {
    public static int getFitnessLevel(
            int steps
    ){
if(steps >= 10000){
    System.out.println("Excellent");
}
else if (steps >= 7000) {
    System.out.println("Good");
}
else if (steps >= 4000) {
    System.out.println("Average");
}
else {
    System.out.println("Poor");
}
 return steps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your steps for today: ");
        int steps = sc.nextInt();

        int totalsteps = getFitnessLevel(steps);
        System.out.println("Your fitness level: "+ totalsteps);

        sc.close();
    }
}
