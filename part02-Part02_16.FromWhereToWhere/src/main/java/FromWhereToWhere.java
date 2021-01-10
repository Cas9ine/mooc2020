
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int destination = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int startingPoint = Integer.valueOf(scanner.nextLine());
        for (int i = startingPoint; i < (destination + 1); i++) {
            System.out.println(i);
        }
        
    }
}
