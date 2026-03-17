import java.util.Scanner;

public class searchelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}

