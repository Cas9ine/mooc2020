
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        for (int i = first; i < (last + 1); i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);

    }
}
