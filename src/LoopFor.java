public class LoopFor {

    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (getMult(i) == 0) {
                System.out.print(" " + i);
            }

        }

    }

    public static int getMult(int a) {
        return (a % 4);
    }

}





