import java.util.Scanner;

class Fibonacci {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the min value:");
        int num = scn.nextInt();
        System.out.println("_ _ _ _ _ _ _ _");
        System.out.println();
        isFibo(num);
    }

    static void isFibo(int num) {
        int a = 0, b = 1, c;
        System.out.println(a + "\n" + b);
        for (int i = 2; i <= num; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
