import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число диапазона, число должно быть целым");

        int c = scanner.nextInt();

        System.out.println("Введите второе число диапазона, число должно быть целым");

        int d = scanner.nextInt();
        int sum = 0;
        int sumEven = 0;
        int counter = 0;

        for (int i = c; i <= d; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                counter++;
            }
            sum = sum + i;
        }

        double resultEven = (double)sumEven / counter;
        double result = (double)sum / ((d - c) + 1);

        System.out.println("Среднее арифметическое всех чисел = " + result);

        System.out.println("Среднее арифметичесткое четных чисел = " + resultEven);

    }

}

