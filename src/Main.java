import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the size of your tree: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < (size - i); j++) {

                System.out.print(" ");

            }
            for (int k = 0; (k < (2 * i) + 1); k++) {

                System.out.print("*");
            }

            System.out.println();

        }


    }
}
