import java.util.Scanner;

public class DSA_Linear_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = null;

        while (true) {
            System.out.println("\t\tLinear Search");
            System.out.println("\t1. Add");
            System.out.println("\t2. Display");
            System.out.println("\t3. Search");
            System.out.println("\t4. Remove");
            System.out.println("\t5. Exit");
            System.out.print("\tEnter a number: ");
            int nu = scanner.nextInt();
            switch (nu) {
                case 1:
                    System.out.println("\t\tAdd");
                    System.out.print("Enter the number of elements in the array: ");
                    int n = scanner.nextInt();

                    ar = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the elements of the array: ");
                        ar[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    if (ar == null) {
                        System.out.println("Array is empty. Add elements first.");
                    } else {
                        System.out.println("Array Elements:");
                        for (int i = 0; i < ar.length; i++) {
                            System.out.print(ar[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (ar == null) {
                        System.out.println("Array is empty. Add elements first.");
                    } else {
                        System.out.println("\t\t Search");
                        System.out.print("Enter the element to search for: ");
                        int target = scanner.nextInt();
                        int a = linearSearch(ar, target);

                        if (a != -1) {
                            System.out.println("Element found at index: " + a);
                        } else {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;

                case 4:
                    if (ar == null) {
                        System.out.println("Array is empty. Add elements first.");
                    } else {
                        System.out.println("\t\t Remove");
                        System.out.print("Enter the element to remove: ");
                        int elementToRemove = scanner.nextInt();
                        ar = removeElement(ar, elementToRemove);
                        System.out.println("Element removed.");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeElement(int[] arr, int elementToRemove) {
        int[] result = new int[arr.length - 1];
        int index = linearSearch(arr, elementToRemove);

        if (index == -1) {
            System.out.println("Element not found in the array.");
            return arr;
        }

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }
}
