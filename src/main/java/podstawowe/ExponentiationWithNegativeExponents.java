package podstawowe;

import java.util.Scanner;

/**
 * Created by HP on 2017-09-04.
 */
public class ExponentiationWithNegativeExponents {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe calkowita:");
        double number = input.nextDouble();
        System.out.println("Podaj potege:");
        double exponentation = input.nextDouble();

        double result = 1;


        if (exponentation > 0) {
            while (exponentation > 0) {
                result = result * number;
                exponentation++;
            }
            System.out.println((int)result);
        } else {
            while (exponentation<0){
                result = result * number;
                exponentation--;

            }
            System.out.println(1/result);

        }


    }
}
