package AlgorytmyArytmetyczne;

/**
 * Created by HP on 2017-09-05.
 */
public class SitoEratostenesa {

    public static int[] doErastotenes(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] != 0 && array[j] != 0 && array[j] % array[i] == 0) {
                    array[j] = 0;
                }
            }

            if (array[i] > (int) Math.sqrt(array.length)) {
                break;
            }
        }
        return array;
    }
    public static void printArray(int [] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {


        int[] array = new int[31];

        array = doErastotenes(array);

        printArray(array);

    }
}
