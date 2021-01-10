
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int numCounter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            
            sum += input;
            numCounter++;
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numCounter);
        double average = (1.0 * sum) / numCounter;
        System.out.println("Average: " + average);
        System.out.println("Even " + evenCounter);
        System.out.println("Odd: " + oddCounter);
        

    }
}
