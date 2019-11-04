import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        String arguments =   scan.nextLine();
        String enter = scan.next();
        String allQeue = enter+ scan.nextLine();
        String splitedTails[] = arguments.split(" ");


        int[] allInput = new int[Integer.valueOf(splitedTails[0]) * 2];
        int index = 0;
        while (index < Integer.valueOf(splitedTails[1])) {
             enter = scan.next();
            String allTails = enter + scan.nextLine();

             splitedTails = allTails.split(" ");

            allInput[2 * index] = Integer.valueOf(splitedTails[0]);
            allInput[2 * index + 1] = Integer.valueOf(splitedTails[1]);
            index++;

        }
        System.out.println(allQeue);
    }
}
