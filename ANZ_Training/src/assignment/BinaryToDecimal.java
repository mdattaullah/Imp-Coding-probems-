package assignment;

import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value:");
        int Bin = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isDec(Bin);
    }

    static void isDec(int Bin) {
        int n = Bin;
        int Dec = 0;
        int i = 0;
        while (n > 0) {
            Dec += n % 10 * (int) Math.pow(2, i++);
            n /= 10;
        }
        System.out.println(Dec);
    }

}