import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
}