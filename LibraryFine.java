import java.util.Scanner;
//This is a java program for calculating a library fines

public class LibraryFine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int BookID;
        System.out.print("Please enter your Book ID:  ");
        BookID = scanner.nextInt();

        //Date the book was to be returned
        int dueDate;
        System.out.print("Enter the due date: (The day only e.g 12): ");
        dueDate = scanner.nextInt();

        //The day the book was returned
        int returnDate;
        System.out.print("Enter the return date (The day only e.g 12): ");
        returnDate = scanner.nextInt();

        //To calculate days overdue
        int Overdue;
        Overdue = returnDate - dueDate;

        int fine;
        int finerate;

        if(Overdue <= 7){
            finerate = 20;
            fine = Overdue * finerate;
            System.out.println("******** WELCOME TO THE LIBRARY FINE MANAGEMENT SYSTEM ********");
            System.out.println(" ");
            System.out.println("Your fine rate is "+finerate+" * "+Overdue);
            System.out.println("Your fine is "+ fine +" ksh.");
        } else if (Overdue >= 8 || Overdue <= 14){
            finerate = 50;
            fine = Overdue * finerate;
            System.out.println("******** WELCOME TO THE LIBRARY FINE MANAGEMENT SYSTEM ********");
            System.out.println(" ");
            System.out.println("Your fine rate is "+finerate+" * "+Overdue);
            System.out.println("Your fine is "+fine+" ksh.");
        } else if (Overdue >= 15 ) {
            finerate = 100;
            fine = Overdue * finerate;
            System.out.println("******** WELCOME TO THE LIBRARY FINE MANAGEMENT SYSTEM ********");
            System.out.println(" ");
            System.out.println("Your fine rate is "+finerate+" * "+Overdue);
            System.out.println("Your fine is "+fine+" ksh.");
        }
        else{
            System.out.println("******** WELCOME TO THE LIBRARY FINE MANAGEMENT SYSTEM ********");
            System.out.println(" ");
            System.out.println("You do not have a fine!");
        }

        System.out.println("Your book ID is " + BookID);
        System.out.println("Your due date was "+dueDate);
        System.out.println("Your return date was "+returnDate);
        System.out.println("Your days overdue is "+Overdue);
        System.out.println(" ");
        System.out.println("*********************************************************");

    }

}
