import java.util.Scanner;

public class string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Length of the string
        System.out.println("Length of string: " + str.length());

        // 2. Convert to Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        // 5. Check Palindrome
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        // 6. Count vowels
        int vowels = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        System.out.println("Number of vowels: " + vowels);

        // 7. Count consonants
        int consonants = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && 
               (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')) {
                consonants++;
            }
        }
        System.out.println("Number of consonants: " + consonants);

        // 8. Search for a character
        System.out.print("Enter a character to search: ");
        char searchChar = sc.next().charAt(0);
        System.out.println("Character found at index: " + str.indexOf(searchChar));

        sc.nextLine(); // clear buffer

        // 9. Replace a character
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        System.out.println("After replacement: " + str.replace(oldChar, newChar));

        sc.nextLine(); // clear buffer

        // 10. Split string into words
        String[] words = str.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // 11. Concatenate another string
        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();
        System.out.println("Concatenated String: " + str.concat(" " + str2));

        sc.close();
    }
}


