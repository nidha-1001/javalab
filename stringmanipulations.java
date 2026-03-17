import java.util.Scanner;

class stringmanipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        
        System.out.println("Length of first string: " + s1.length());

        
        System.out.println("Concatenation: " + s1.concat(s2));

        
        System.out.println("Character at index 2 in first string: " + s1.charAt(2));

        
        char[] ch = new char[5];
        s1.getChars(0, 5, ch, 0);
        System.out.print("getChars() output: ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        
        System.out.println("compareTo(): " + s1.compareTo(s2));

        
        System.out.println("equals(): " + s1.equals(s2));

       
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

        
        System.out.println("startsWith(\"Ja\"): " + s1.startsWith("Ja"));

        
        System.out.println("endsWith(\"va\"): " + s1.endsWith("va"));

        
        System.out.println("contains(\"av\"): " + s1.contains("av"));

        
        System.out.println("indexOf('a'): " + s1.indexOf('a'));

       
        System.out.println("toUpperCase(): " + s1.toUpperCase());

        
        System.out.println("toLowerCase(): " + s1.toLowerCase());

        
        System.out.println("replace('a','@'): " + s1.replace('a', '@'));

        sc.close();
    }
}

