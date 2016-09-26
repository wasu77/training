import java.util.Scanner;

public class FibonacciPrint {

    public static void main(String[] args) {
        FibonacciPrint fp1 = new FibonacciPrint();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        fp1.fibonacci(input);
    }

    public void fibonacci (int input) {
        int fibo0 = 0;
        int fibo1 = 1;
        int temp;
        System.out.println(fibo0+"\n"+fibo1);

        for (int i = 0; i < input; i++) {
            temp = fibo0 + fibo1;
            fibo0 = fibo1;
            fibo1 = temp;
            System.out.println(temp +" ");

        }
    }
}
