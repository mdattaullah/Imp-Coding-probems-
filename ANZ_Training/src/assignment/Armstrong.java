package assignment;

import java.util.Scanner;

class Armstrong {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value:");
        int num = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isArm(num);
    }

    static void isArm(int num) {

        int n = num;
        int total = 0;
        int c = (n + "").length();
        while (n > 0) {
            total += (int) Math.pow(n % 10, c);
            n /= 10;
        }
        if (num == total)
            System.out.print("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}