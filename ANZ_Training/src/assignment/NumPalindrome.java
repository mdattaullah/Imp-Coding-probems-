import java.util.Scanner;

class NumPalindrome {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the min value:");
        int num = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isPal(num);
    }

    static void isPal(int num) {
        int n = num;
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        if (num == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
