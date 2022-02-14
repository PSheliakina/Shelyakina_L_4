public class CycleFor {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        for (int i = b; i >= a; i--) {
            if (i % 4 == 0) {
                System.out.println("Результат " + i);
            }
        }
    }
}
