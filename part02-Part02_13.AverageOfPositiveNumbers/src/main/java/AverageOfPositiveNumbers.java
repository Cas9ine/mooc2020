
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCounter = 0;
        int positiveSum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveCounter += 1;
                positiveSum += number;
            }
        }
        
        if (positiveCounter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (positiveSum * 1.0) / positiveCounter;
            System.out.println(average);
                    
        }

    }
}
