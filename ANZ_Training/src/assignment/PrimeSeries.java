import java.util.Scanner;

class PrimeSeries {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the min value:");
        int min = scn.nextInt();
        System.out.println("Enter the max value:");
        int max = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _ _");
        System.out.println();
        isPrime(min, max);
    }

    static void isPrime(int min, int max) {
        while (min < max) {
            boolean flag = false;
            for (int i = 2; i < min; i++) {
                if (min % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && min != 1 && min != 0)
                System.out.println(min + " ");
            min++;
        }
    }
}