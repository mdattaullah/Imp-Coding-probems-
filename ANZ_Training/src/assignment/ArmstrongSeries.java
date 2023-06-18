package assignment;

import java.util.Scanner;

class ArmstrongSeries {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the min value:");
        int min = scn.nextInt();
        System.out.println("Enter the max value:");
        int max = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isArm(min, max);
    }

    static void isArm(int min, int max) {
        for (int i = min; i < max; i++) {
            int n = i;
            int total = 0;
            int c = (n + "").length();
            while (n > 0) {
                total += (int) Math.pow(n % 10, c);
                n /= 10;
            }
            if (total == i)
                System.out.print(i + "  ");
        }
    }
}