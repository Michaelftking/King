
import java.util.Scanner;

public class NumberFormatexcep {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
while(true){
        System.out.print("Enter a number (in the format '123.45'): ");
        String input = scanner.nextLine();

        try {
            double number = Double.parseDouble(input);
            System.out.println("You entered a valid number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException occurred: Invalid number format");
        }
    }
}
}
