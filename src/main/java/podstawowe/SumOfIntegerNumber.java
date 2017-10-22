package podstawowe;

import java.util.Scanner;

/**
 * Created by HP on 2017-09-04.
 */
public class SumOfIntegerNumber {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj liczbe calkowita: ");
        int x = skaner.nextInt();
        int result = 0;

        while (x != 0) {
            result = result + (x % 10);
            x = x/10;
        }
        System.out.println(result);

    }

}
