public class Average {
    public static void main(String[] args) {

        double c = 4;
        double d = 29;
        double sum = 0;
        double sumEven = 0;
        double counter = 0;

        for (double i = c; i <= d; i++) {
            sum = sum + i;
        }

        double result = sum / ((d - c) + 1);
        System.out.println("Среднее арифметическое всех чисел " + result);

        for (double i = c; i <= d; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                counter ++;
            }
        }

        double resultEven = sumEven;
        System.out.println("Среднее арифметичесткое четных чисел " + resultEven / counter);


    }

}

