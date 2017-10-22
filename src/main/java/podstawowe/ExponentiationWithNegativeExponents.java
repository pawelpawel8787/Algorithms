package podstawowe;

import java.util.Scanner;

/**
 * Created by HP on 2017-09-04.
 */
public class ExponentiationWithNegativeExponents {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj liczbe calkowita a : ");
        int a = skaner.nextInt();
        System.out.print("Podaj liczbe calkowita b : ");
        int b = skaner.nextInt();
        int result = 1;

        while (true) {

            if (b > 0) {
                result = result * a;
                b = b - 1;
            }
            else if(b<0){
                result = result * a;
                b = b + 1;
                


            }
            System.out.println(result);
        }


    }
}
