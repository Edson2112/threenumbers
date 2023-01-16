package ua.edson.threenumber;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Ввести с консоли 3 различных числа a, b, c. Вывести на экран максимальное, минимальное и среднее число.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число a: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число b: ");
        int b = scanner.nextInt();

        System.out.println("Введите третье число c: ");
        int c = scanner.nextInt();

        // Узнаём Максимальное число

        if (a > b && a > c) {
            System.out.println("Это чисто является максимальным: " + a);
        } else if (b > a && b > c) {
            System.out.println("Это чисто является максимальным: " + b);
        } else if (c > a && c > b) {
            System.out.println("Это чисто является максимальным: " + c);
        }

        // Узнаём Минимальное число

        if (a < b && a < c) {
            System.out.println("Это чисто является минимальным: " + a);
        } else if (b < a && b < c) {
            System.out.println("Это чисто является минимальным: " + b);
        } else if (c < a && c < b) {
            System.out.println("Это чисто является минимальным: " + c);
        }

        // Узнаём Среднее число

            //  if ((a - b) * (c - a) >= 0) {
        if ((a >= b && a <= c) || (a <= b) && (a >= c)) {
            System.out.print("Это чисто является средним: " + a);
            //  } else if ((b - a) * (c - b) >= 0) {
        } else if ((b >= a) && (b <= c) || (b <= a) && (b >= c)) {
            System.out.print("Это чисто является средним: " + b);
        } else {
            System.out.print("Это чисто является средним: " + c);
        }
    }
}
