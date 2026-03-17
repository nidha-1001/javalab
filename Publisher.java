import java.util.Scanner;

class Publisher {
    String publisherName;

    void getPublisher(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }

    void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

class Book extends Publisher {
    String title;
    String author;

    void getBook(Scanner sc) {
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        displayPublisher();
    }
}

class Literature extends Book {
    void displayLiterature() {
        System.out.println("\n--- Literature Book Details ---");
        displayBook();
    }
}

class Fiction extends Book {
    void displayFiction() {
        System.out.println("\n--- Fiction Book Details ---");
        displayBook();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Book Category:");
        System.out.println("1. Literature");
        System.out.println("2. Fiction");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Literature l = new Literature();
            l.getBook(sc);
            l.getPublisher(sc);
            l.displayLiterature();
        } 
        else if (choice == 2) {
            Fiction f = new Fiction();
            f.getBook(sc);
            f.getPublisher(sc);
            f.displayFiction();
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
