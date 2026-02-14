package Day_8;

import java.util.Scanner;

public class prog_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Change the case of the string");
        System.out.println("2. Reverse the string");
        System.out.println("3. Compare two strings");
        System.out.println("4. Insert one string into another string");
        System.out.println("5 Convert the string to upper case and lower case");
        System.out.println("6. Check whether the character is present in the string and at which position");
        System.out.println("7 Check whether the string is palindrome or not");
        System.out.println("8. Check the number of word, vowel and consonant in the string");
        System.out.println("Enter your choice:");
        int s = sc.nextInt();
        sc.nextLine();
        switch (s) {
            case 1:
                System.out.println("Enter a string:");
                String st1 = sc.nextLine();
                String str1 = upperCase(st1);
                System.out.println("String after changing case: " + str1);
                break;

            case 2:
                System.out.println("Enter a string:");
                String st2 = sc.nextLine();
                String str2 = reverse(st2);
                System.out.println("String after reversing: " + str2);
                break;

            case 3:
                System.out.println("Enter a string:");
                String st3 = sc.nextLine();
                System.out.println("Enter another string for comparison:");
                String st4 = sc.nextLine();
                int x = compare(st3, st4);
                System.out.println("Comparison value = " + x);
                break;

            case 4:
                System.out.println("Enter a string:");
                String st5 = sc.nextLine();
                System.out.println("Enter another string to insert:");
                String st6 = sc.nextLine();
                String str4 = insert(st5, st6);
                System.out.println("String after inserting: " + str4);
                break;

            case 5:
                System.out.println("Enter a string:");
                String st7 = sc.nextLine();
                String str = upperCase(st7);
                String str5 = lowerCase(st7);
                System.out.println("String in UpperCase: " + str);
                System.out.println("String in LowerCase: " + str5);
                break;

            case 6:
                System.out.println("Enter a string:");
                String st8 = sc.nextLine();
                System.out.println("Enter a character: ");
                char a = sc.next().charAt(0);
                int y = index(st8, a);
                if (y == 0)
                    System.out.println("Character not found");
                else
                    System.out.println("Character found at index " + y);
                break;

            case 7:
                System.out.println("Enter a string:");
                String st9 = sc.nextLine();
                String str7 = reverse(st9);
                if ((compare(st9, str7)) == 0)
                    System.out.println("String is palindrome");
                else
                    System.out.println("String is not palindrome");
                break;

            case 8:
                System.out.println("Enter a string:");
                String st10 = sc.nextLine();
                int p, q, r;
                p = vowel(st10);
                System.out.println("Number of Vowels = " + p);
                q = consonent(st10);
                System.out.println("Number of Consonents = " + q);
                r = word(st10);
                System.out.println("Number of Words = " + r);
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

    static String upperCase(String str) {
        String str1 = str.toUpperCase();
        return str1;
    }

    static String reverse(String str) {
        String str2 = "";
        StringBuffer ob = new StringBuffer(str);
        str2 = ob.reverse().toString();
        return str2;
    }

    static int compare(String str, String strr) {
        int x = 0;
        x = str.compareTo(strr);
        return x;
    }

    static String insert(String str, String strr) {
        String str4 = "";
        str4 = str + " " + strr;
        return str4;
    }

    static String lowerCase(String str) {
        String str5 = "";
        str5 = str.toLowerCase();
        return str5;
    }

    static int index(String str, char a) {
        int x;
        if ((x = str.indexOf(a)) != 0)
            return x;
        return 0;
    }

    static int vowel(String str) {
        int x = 0;
        int l = str.length();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                x++;
        }
        return x;
    }

    static int consonent(String str) {
        int y = 0;
        int l = str.length();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                y++;
        }
        return y;
    }

    static int word(String str) {
        int z = 0;
        int l = str.length();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                z++;
        }
        z++;
        return z;
    }
}
