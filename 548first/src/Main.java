import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        String length = scan.nextLine();
        String allString = scan.nextLine();
        String[] splitedTails = allString.split("");
        //System.out.println(Arrays.toString(splitedTails));
        int sum = 0;
        for (int i = 0; i < Integer.valueOf(length); i++) {
            if (Integer.valueOf(splitedTails[i]) % 2 == 0) {
                sum = sum + i+1;
            }
        }
        System.out.println(sum);
    }
}
