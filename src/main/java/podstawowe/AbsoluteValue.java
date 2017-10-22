package podstawowe;

import java.util.Scanner;

/**
 * Created by HP on 2017-09-04.
 */
public class AbsoluteValue {

    public static void main(String[] args) {


        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbe calokowita:");
        int x = skaner.nextInt();
        System.out.println(getAbsolute(x));

    }

    public static int getAbsolute(int x){

        if (x>=0){
            return x;
        }
        else{
            return x*-1;
        }
    }
}
