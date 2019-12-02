import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Простые числа от 1 до " + n + ": ");
        for (int i = 2; i < n; i++) {
            if (Simple.simple_number(i))
                System.out.print(i + " ");
        }
    }
}
