import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scn.nextInt();
        isPrime(num);
    }

    static void isPrime(int num) {
        int n = num;
        while (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}