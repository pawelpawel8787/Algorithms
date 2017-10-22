package AlgorytmyArytmetyczne;

import java.util.Scanner;

/**
 * Created by HP on 2017-09-05.
 */
public class NajmniejszaWspolnaWielokrotnosc {

    public static int doEuklides(int a, int b) {

        while (a!=b)
            if (a<b){
                b-=a;
            }
            else {
                a-=b;
            }
        return a;
    }

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a = skaner.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b = skaner.nextInt();


        int result = a*b/doEuklides(a,b);

        System.out.println(result);


    }
}
