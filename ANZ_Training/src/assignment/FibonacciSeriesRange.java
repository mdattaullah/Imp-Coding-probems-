import java.util.Scanner;

class FibonacciSeriesRange {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the min value:");
        int min = scn.nextInt();
        System.out.println("Enter the max value:");
        int max = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isFibo(min, max);
    }

    static void isFibo(int min, int max) {
        int a = 0;
        int b = 1;
        int c;
        while (a <= max) {
            if (a >= min)
                System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

}