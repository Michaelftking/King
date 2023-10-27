
import java.util.HashMap;
import java.util.Scanner;

public class DSA_HashTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String>[] ha = new HashMap[10];

        for (int i = 0; i < 10; i++) {
            ha[i] = new HashMap<>();
        }

        while (true) {
        				System.out.println("\t\tHash Table");
        				System.out.println("\t1. Add");
        				System.out.println("\t2. Display");
        				System.out.println("\t3. Remove");
        				System.out.println("\t4. Exit");
        				System.out.print("\tEnter a number: ");
        				int ch = scanner.nextInt();
        				switch(ch){
        								case 1:
        								System.out.println("\t Add");
        								System.out.print("Enter a key (integer) or -1 to exit: ");
            int key = scanner.nextInt();

            if (key == -1) {
                System.exit(0);
            }

            System.out.print("Enter a value (string): ");
            String value = scanner.next();

            int index = key % 10;
            ha[index].put(key, value);
        
        								
        								break;
        								case 2:
        								System.out.println("\t Display");
        								System.out.println("Hash Table Contents: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Index " + i + ": " + ha[i]);
        }
        								break;
        								case 3:
        								 System.out.print("Enter index to remove: ");
                    int elementToRemove = scanner.nextInt();
                    int removeIndex = elementToRemove % 10;
                    if (ha[removeIndex].containsKey(elementToRemove)) {
                        ha[removeIndex].remove(elementToRemove);
                        System.out.println("Removed successfully");
                    } else {
                        System.out.println("Element not found, unable to remove.");
                    }
        								
        								break;
        								
        								case 4:
        								System.exit(0);
        								break;
        				}
        				
    }
}
}