package podstawowe;

import java.util.Random;

/**
 * Created by HP on 2017-09-04.
 */
public class ArithmeticAverage {

    public static void main(String[] args) {

        Random random = new Random();
        int n = 10;
        double[] array = new double[n];

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i]+ ", ");
            sum+=array[i];
        }
        System.out.println();
        System.out.println("Srednia arytmetyczna ze zbioru wynosi: " + sum/n);

    }
}
