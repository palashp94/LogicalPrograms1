public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 100;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series Upto" + n + ": ");

        while (a <= n) {
            System.out.print(a + ", ");

            int Z = a + b;
            a = b;
            b = Z;

        }
    }
}

