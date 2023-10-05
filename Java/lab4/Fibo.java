import java.util.Scanner;

class Fibo{
    static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();
        System.out.println("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
}
