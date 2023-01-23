import java.util.Scanner;

public class Test {

    public int summa(int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Test t = new Test();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод двух чисел для вывода их суммы...");
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();
        System.out.println("Результат: " + a + " + " + b + " = " + t.summa(a, b));
    }
}