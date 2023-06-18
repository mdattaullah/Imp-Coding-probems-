import java.util.Scanner;

class StringPalindrome {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the min value:");
        String str = scn.nextLine();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isPal(str);
    }

    static void isPal(String str) {
        String s1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s1 += str.charAt(i);
        }
        if (str.equals(s1))
            System.out.println("Palindrome");
        else
            System.out.println("NOt Palindrome");
    }
}
