import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numberOfTails = scan.nextInt();
        int[] allInput = new int[numberOfTails * 2];
        int index = 0;
        while (index < numberOfTails) {
            String enter = scan.next();
            String allTails = enter + scan.nextLine();

            String splitedTails[] = allTails.split(" ");

            allInput[2 * index] = Integer.valueOf(splitedTails[0]);
            allInput[2 * index + 1] = Integer.valueOf(splitedTails[1]);
            index++;

        }
        int numberOfPages = scan.nextInt();
        //System.out.println(Arrays.toString(allInput));
        //System.out.println(numberOfPages);
        int i = 0;
        index = 0;
        while (index < allInput.length) {
            if(numberOfPages>=allInput[index] && numberOfPages<= allInput[index+1]){
                break;
            }
            index = index+2;
        }
        System.out.println(allInput.length/2-index/2);


    }
}
