import java.util.Scanner;

public class IT20660734Lab9Q4 {

    public static double calcFinalMark(double assignment,
                                       double exam) {

        return (assignment * 0.30) + (exam * 0.70);
    }

    public static String findGrades(double mark) {

        if(mark >= 75)
            return "A";
        else if(mark >= 60)
            return "B";
        else if(mark >= 50)
            return "C";
        else
            return "F";
    }

    public static void printDetails(String name,
                                    double mark,
                                    String grade) {

        System.out.printf("%-10s %-12.2f %-5s\n",
                name, mark, grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for(int i=0;i<5;i++){

            System.out.print(
                    "Enter Name of Student "
                            +(i+1)+": ");
            names[i] = sc.next();

            System.out.print(
                    "Enter Assignment Mark for "
                            +names[i]+": ");
            double assignment =
                    sc.nextDouble();

            System.out.print(
                    "Enter Exam Paper Mark for "
                            +names[i]+": ");
            double exam =
                    sc.nextDouble();

            finalMarks[i] =
                    calcFinalMark(
                            assignment,
                            exam);

            grades[i] =
                    findGrades(
                            finalMarks[i]);
        }

        System.out.println();
        System.out.printf(
                "%-10s %-12s %-5s\n",
                "Name",
                "Final Mark",
                "Grade");

        for(int i=0;i<5;i++){
            printDetails(
                    names[i],
                    finalMarks[i],
                    grades[i]);
        }
    }
}