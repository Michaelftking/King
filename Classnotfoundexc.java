import java.util.Scanner;

public class Classnotfoundexc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        try {
            // Attempt to load the class dynamically
            Class<?> dynamicClass = Class.forName(className);

            // If the class is loaded successfully, you can do something with it
            System.out.println("Class loaded successfully: " + dynamicClass.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
}

				
