import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Read strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Menu
        System.out.println("\nMenu:");
        System.out.println("1 -> Built-in Sorting");
        System.out.println("2 -> User-defined Sorting");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Built-in sorting
                Arrays.sort(arr);
                System.out.println("\nSorted using Built-in Method:");
                for (String s : arr) {
                    System.out.println(s);
                }
                break;

            case 2:
                // User-defined sorting (Bubble Sort)
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j].compareTo(arr[j + 1]) > 0) {
                            // swap
                            String temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }

                System.out.println("\nSorted using User-defined Method (Bubble Sort):");
                for (String s : arr) {
                    System.out.println(s);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

