import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число диапозона");

        Double number1 = scanner.nextDouble();

        System.out.println("Введите второе число диапозона");

        Double number2 = scanner.nextDouble();

        double c = number1;
        double d = number2;
        double sum = 0;
        double sumEven = 0;
        double counter = 0;

        for (double i = c; i <= d; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                counter++;
            }
            sum = sum + i;
        }

        double resultEven = sumEven;
        double result = sum / ((d - c) + 1);

        System.out.println("Среднее арифметическое всех чисел = " + result);

        System.out.println("Среднее арифметичесткое четных чисел = " + resultEven / counter);

    }

}

