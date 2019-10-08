import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        int numberOfTails = scan.nextInt();
        String enter = scan.next();
        String allTails = enter + scan.nextLine();

        String splitedTails[] = allTails.split("");

        int firstTailsAsIntegers[] = new int[splitedTails.length];
        int secondTailsAsIntegers[] = new int[splitedTails.length];


        for (int i = 0; i < splitedTails.length; i++) {

            firstTailsAsIntegers[i] = Integer.parseInt(splitedTails[i]);
        }

        enter = scan.next();
        allTails = enter + scan.nextLine();

        splitedTails = allTails.split("");

        for (int i = 0; i < splitedTails.length; i++) {

            secondTailsAsIntegers[i] = Integer.parseInt(splitedTails[i]);
        }

        //System.out.println(Arrays.toString(firstTailsAsIntegers));
        // System.out.println(Arrays.toString(secondTailsAsIntegers));
        if (!canPreform(firstTailsAsIntegers, secondTailsAsIntegers)) {
            System.out.println("-1");
        }
    }

    public static boolean canPreform(int[] firstLine, int[] secondLine) {
        int firsLineOnlyOnes = 0;
        int secondLineOnlyOnes = 0;
        int bothLinesOnes = 0;
        int[] answer = new int[firstLine.length];

        for (int i = 0; i < firstLine.length; i++) {
            if (firstLine[i] == 1) {
                if (secondLine[i] == 1) {
                    bothLinesOnes++;
                } else {
                    firsLineOnlyOnes++;
                }
            }

            if (secondLine[i] == 1) {
                if (firstLine[i] != 1) {
                    secondLineOnlyOnes++;
                }
            }
        }

//        if(Math.abs(firsLineOnlyOnes-secondLineOnlyOnes)-bothLinesOnes>0){
//            return false;
//        }
        if ((firsLineOnlyOnes - secondLineOnlyOnes) == 0 && bothLinesOnes % 2 == 1) {
            return false;
        }

        if (firsLineOnlyOnes > 2 * (secondLineOnlyOnes + bothLinesOnes)) {
            return false;
        }

        if (secondLineOnlyOnes > 2 * (firsLineOnlyOnes + bothLinesOnes)) {
            return false;
        }


        for (int i = 0; i < firstLine.length; i++) {
            if (firstLine[i] == 1 & secondLine[i] == 1) {
                if (firsLineOnlyOnes > 2 * (secondLineOnlyOnes)) {
                    firstLine[i] = 0;
                    firsLineOnlyOnes--;
                }
                if (secondLineOnlyOnes > 2 * (firsLineOnlyOnes)) {
                    secondLine[i] = 0;
                    secondLineOnlyOnes--;
                }

            }
        }

        answer = firstLine;
        Arrays.toString(answer);

//        for (int i = 0; i < firstLine.length; i++) {
//            if (firsLineOnlyOnes/2 > secondLineOnlyOnes){
//                if(firstLine[i]==1 && secondLine[i] ==0){
//                    answer[i] = 0;
//                }
//                else {
//                    answer[i] = 1;
//                }
//                firsLineOnlyOnes--;
//            }
//
//        }


        return true;
    }


}
