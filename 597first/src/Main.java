import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberOfTests = scan.nextLine();
        //String enter = scan.next();
        // String allQeue = enter+ scan.nextLine();
        //  String splitedTails[] = numberOfTests.split(" ");


        int[] allInput = new int[Integer.valueOf(numberOfTests) * 2];
        int index = 0;
        while (index < Integer.valueOf(numberOfTests)) {
            String enter = scan.next();
            String allTails = enter + scan.nextLine();

            String[] splitedTails = allTails.split(" ");

            allInput[2 * index] = Integer.valueOf(splitedTails[0]);
            allInput[2 * index + 1] = Integer.valueOf(splitedTails[1]);

            index++;

        }
        int maxVal = IntStream.range(0, allInput.length).map(i -> allInput[i]).max().getAsInt();

        int[] finalArray = new int[maxVal +1];
        for (int j = 0; j < Integer.valueOf(numberOfTests); j++) {
            int a = allInput[2 * j];
            int b = allInput[2 * j + 1];
            finalArray = new int[finalArray.length];
            Arrays.fill(finalArray, 1);
            finalArray[0] = 0;
            // System.out.println(Arrays.toString(finalArray));
            for (int i = 0; i * Integer.valueOf(numberOfTests) < finalArray.length ; i++) {
                if ((i >= a && finalArray[i - a] == 0) || (i >= b && finalArray[i - b] == 0)) {
                    finalArray[i] = 0;
                }


            }
            System.out.println(checkAnyJump(finalArray, a, b));

        }
        System.out.println(Arrays.toString(finalArray));
    }


    public static String checkAnyJump(int[] array, int a, int b) {
        int jump;
        int diff = Math.abs(a - b);

        /// test a jump
        jump = a;
        if (checkJump(array, a) || checkJump(array, b) || checkJump(array, diff)) {
            return "Infinite";
        }
        return "Finite";


    }

    public static Boolean checkJump(int[] array, int jump) {
        //int index = 0;
        for (int startIndex = 1; startIndex < array.length; startIndex++) {
           // index = 0;
            while (startIndex < array.length) {
                if (array[startIndex] == 1) {
                    startIndex = startIndex + jump;
                } else {
                    break;
                }

            }
            if (startIndex > array.length) {
                return true;
            }
        }
        return false;

    }


}
