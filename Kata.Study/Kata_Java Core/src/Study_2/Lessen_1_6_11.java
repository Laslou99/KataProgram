package Study_2;

import java.util.Scanner;

public class Lessen_1_6_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, end;
        char op;

        System.out.println("Введите первое число: ");
        num1 = sc.nextDouble();

        System.out.println("Введите значение: ");
        op = sc.next().charAt(0);

        System.out.println("Введите второе число: ");
        num2 = sc.nextDouble();

        switch (op){
            case '+':
                end = num1 + num2;
                break;
            case '-':
                end = num1 - num2;
                break;
            case '/':
                end = num1 / num2;
                break;
            case '*':
                end = num1 * num2;
                break;
            default:
                System.out.println("ERROR!");
            return;
        }
        System.out.println("Результат: ");
        System.out.print(num1 + " " + op + " " + num2 + " = " + end);
    }
}