package assignment;

import java.util.Scanner;

class DecimalToBinary {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value:");
        int Dec = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isBin(Dec);
    }

    static void isBin(int Dec) {
        int n = Dec;
        int Bin = 0;
        int i = 1;
        while (n > 0) {
            Bin += n % 2 * i;
            n /= 2;
            i *= 10;
        }
        System.out.println(Bin);
    }

}