
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int i = 1; i < (number + 1); i++) {
            factorial = factorial * i;
            //System.out.println(factorial);
        }
        System.out.println("Factorial: " + factorial);

    }
}
