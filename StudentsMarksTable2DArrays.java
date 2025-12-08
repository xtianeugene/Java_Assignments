public class StudentsMarksTable2DArrays {
    public static void main(String[] args) {
        int marks[][] = {
                {75, 80, 90},
                {65, 70, 85},
                {88, 92, 81}
        };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.printf("     %3d     ", marks[i][j]);
            }
            System.out.println();
        }
        int total = 0;
        int ThirdRowIndex = 2;
        for (int j = 0; j < marks[ThirdRowIndex].length; j++) {
            total += marks[ThirdRowIndex][j];
        }
        System.out.println("Total marks of student 3: " + total);
    }
}