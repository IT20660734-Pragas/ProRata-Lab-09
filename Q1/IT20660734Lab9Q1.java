import java.util.Scanner;

public class IT20660734Lab9Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, d, root1, root2;

        System.out.print("Enter value a: ");
        a = sc.nextDouble();

        System.out.print("Enter value b: ");
        b = sc.nextDouble();

        System.out.print("Enter value c: ");
        c = sc.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and different");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
        else if (d == 0) {
            root1 = -b / (2 * a);

            System.out.println("Roots are real and equal");
            System.out.println("Root: " + root1);
        }
        else {
            System.out.println("Roots are imaginary");
        }
    }
}