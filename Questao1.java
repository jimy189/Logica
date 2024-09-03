import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1, c = 0;
        while (c < number) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == number || number == 0;
    }
}
