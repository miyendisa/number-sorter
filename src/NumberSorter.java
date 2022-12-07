import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;

        System.out.print("Enter the first number (x) : ");
        x = scanner.nextInt();

        System.out.print("Enter the second number (y) : ");
        y = scanner.nextInt();

        System.out.print("Enter the third number (z) : ");
        z = scanner.nextInt();

        if ((x < y) && (x < z)) {
            if (y < z) {
                System.out.print("Sort Result: x < y < z");
            } else {
                System.out.print("Sort Result: x < z < y");
            }
        } else if ((y < x) && (y < z)) {
            if (x < z) {
                System.out.print("Sort Result: y < x < z");
            } else {
                System.out.print("Sort Result: y < z < x");
            }
        } else {
            if (x < y) {
                System.out.print("Sort Result: z < x < y");
            } else {
                System.out.print("Sort Result: z < y < x");
            }
        }

    }
}
