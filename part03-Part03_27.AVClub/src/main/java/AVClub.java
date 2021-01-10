
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        while (!input.isEmpty()) {
            String[] array = input.split(" ");
            for (String s : array) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
            input = scanner.nextLine();
        }


    }
}
