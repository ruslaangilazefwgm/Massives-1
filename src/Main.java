import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] mass = new int [] {1, 2, 3};
        double[] drop = {1.57, 7.654, 9.986};
        short[] any = new short[] {3,2,1};

        // Задача 2
        System.out.println("Задача 1-2");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
            if (i != mass.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int v = 0; v < drop.length; v++) {
            System.out.print(drop[v]);
            if (v != drop.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (short c = 0; c < any.length; c++) {
            System.out.print(any[c]);
            if (c != any.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        //int[] mass = new int [] {1, 2, 3};
        //double[] drop = {1.57, 7.654, 9.986};
        //short[] any = new short[] {3,2,1};
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int v = drop.length - 1; v >= 0; v--) {
            System.out.print(drop[v]);
            if (v != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int c = any.length - 1; c >= 0; c--) {
            System.out.print(any[c]);
            if (c != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        //int[] mass = new int [] {1, 2, 3};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                mass[i] += 1;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}