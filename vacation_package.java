import java.util.Scanner;
public class vacation_package {

    //Function calculateTotalCost
    public static double calculateTotalCost(
            double accomodationCost,
            double mealCost,
            double activityCost)
    {
        return accomodationCost + mealCost + activityCost;
    }
    public static void main(String[] args){
//Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter accomodation cost: ");
        double accomodationCost = input.nextDouble();

        System.out.print("Enter meal cost: ");
        double mealCost = input.nextDouble();

        System.out.print("Enter activity cost: ");
        double activityCost = input.nextDouble();

        //Output
        double totalCost = calculateTotalCost(accomodationCost, mealCost, activityCost);
        System.out.println("Total vacation Cost: " + totalCost);

    }}
