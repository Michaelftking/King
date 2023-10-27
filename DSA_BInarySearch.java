
				
import java.util.Scanner;

public class DSA_BInarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    				int[] a = null;
    				while (true){
    								System.out.println("\n\t\tBINARY SEARCH");
    								System.out.println("\t1. Add");
    								System.out.println("\t2. Display");
    								System.out.println("\t3. Search");
    								System.out.println("\t4. Exit");
    								System.out.print("Enter a number: ");
    								int ch = scanner.nextInt();
    								
    								switch(ch){
    												case 1:System.out.println("\t\t Add");
    												
    												System.out.print("\nEnter how many element to add in array [00] exit: ");
        int n = scanner.nextInt();
         a = new int[n];
    				
        for (int i = 0; i < n; i++) {
        				System.out.print("Enter the sorted elements of the array:");
            a[i] = scanner.nextInt();
        }
System.out.println("Successfully added\n");
        
    												break;
    												case 2:System.out.println("\t\t Display");
    												
    												           if (a == null) {
                        System.out.println("Array is empty. Add elements first.");
                    } else {
                        System.out.println("Array Elements:");
                        for (int i = 0; i < a.length; i++) {
                            System.out.print(a[i] + " ");
                        }
                        System.out.println();
                    }
    												break;
    												case 3:
    												System.out.println("\t\t Search");
    												System.out.print("Enter the number you want to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(a, target);

        if (result == -1) {
            System.out.println("The element is not in the array.");
        } else {
            System.out.println("The element is at index: " + result);
        }
    												break;
    												case 4:
    												System.exit(0);
    												break;
    								}
    								
        
    }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}