public class StudentMarks2DArrays {
    public static void main(String[] args) {
        int marks[][] = {
                {80, 70, 90},
                {60, 85, 75},
                {88, 92, 79}
        };
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of row " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[i][j]);
            }
            System.out.println();
        }

        int firstRowSum = 0;
        int firstRowLength = marks[0].length;

        for (int j = 0; j < firstRowLength; j++) {
            firstRowSum += marks[0][j];
        }
        double average = (double) firstRowSum / firstRowLength;
        System.out.println("Average marks of first row: " + average);
    }
}