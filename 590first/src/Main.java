import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String numberOfTests =   scan.nextLine();
        //String enter = scan.next();
       // String allQeue = enter+ scan.nextLine();
      //  String splitedTails[] = numberOfTests.split(" ");


        int[] allInput = new int[Integer.valueOf(numberOfTests)*3 ];
        int index = 0;
        while (index < Integer.valueOf(numberOfTests)) {
           String enter = scan.next();
            String allTails = enter + scan.nextLine();

            String [] splitedTails = allTails.split(" ");

            allInput[3 * index] = Integer.valueOf(splitedTails[0]);
            allInput[3 * index + 1] = Integer.valueOf(splitedTails[1]);
            allInput[3 * index + 2] = Integer.valueOf(splitedTails[2]);

            index++;

        }
       // System.out.println(Arrays.toString(allInput));
        for(index =0 ; index <3*Integer.valueOf(numberOfTests); index=index+3){
            int sum =0 ;
            while (allInput[index+1]>=1&& allInput[index+2]>=2){
                sum = sum +3;
                allInput[index+1] = allInput[index+1] -1;
                allInput[index+2] =allInput[index+2] -2;
            }

            while (allInput[index]>=1&& allInput[index+1]>=2){
                sum = sum +3;
                allInput[index] = allInput[index] -1;
                allInput[index+1] =allInput[index+1] -2;
            }
            System.out.println(sum);
        }
    }
}
