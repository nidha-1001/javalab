import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }

        if (i == n && n > 1)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");

        sc.close();
    }
}

