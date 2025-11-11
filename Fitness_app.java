import java.util.Scanner;
public class Fitness_app {
    public static String getFitnessLevel(
            int steps
    ){
if(steps >= 10000){
    return "Excellent";
}
else if (steps >= 7000 || steps < 10000) {
    return "Good";
}
else if (steps >= 4000 || steps < 7000) {
    return "Average";
}
else {
    return "Poor";
}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your steps for today: ");
        int steps = sc.nextInt();

        String totalsteps = getFitnessLevel(steps);
        System.out.println("Your fitness level: "+ totalsteps);

        sc.close();
    }
}