package PrzetwarzanieDat;

import java.util.Scanner;

/**
 * Created by HP on 2017-09-06.
 */
public class RokPrzestepny {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        System.out.println("Podaj rok i sprawdz czy jest rokiem przestepnym");
        int year = input.nextInt();

        if (year%4==0 && (!(year%100==0)) || year%400==0){
            System.out.println("Rok " + year + " jest rokiem przestepnym");
        }
        else{
            System.out.println("Rok " + year + " nie jest rokiem przestepnym");
        }

}
}