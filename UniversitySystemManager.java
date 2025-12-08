import java.util.Scanner;

class Employee{
    String name;
    double salary;

    void displayinfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    class Lecturer{
        String department;
        @Ovverride
        void displayinfo(){
            System.out.println("Lecturer Department: " + department);
        }
    }
}

public class UniversitySystemManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = input.nextDouble();

        Lecturer lecturer = new Lecturer();
        lecturer.name = name;
        lecturer.salary = salary;

        System.out.print("Enter Lecturer Department: ");
        input.nextLine();
        lecturer.department = input.nextLine();
        lecturer.displayinfo();
        input.close();
    }
}