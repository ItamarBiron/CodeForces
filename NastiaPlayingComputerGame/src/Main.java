import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String enter = scan.next();
        String allTails = enter + scan.nextLine();
        String splitedTails[] = allTails.split(" ");
        int arguments[] = new int[splitedTails.length];
        arguments[0] = Integer.valueOf(splitedTails[0]);
        arguments[1] = Integer.valueOf(splitedTails[1]);
        int firstArg = arguments[0];
        int secondArg = arguments[1];
        int minDistance = Math.min(secondArg-1, firstArg-secondArg);
        int maxDistance = Math.max(secondArg-1, firstArg - secondArg);
        if(firstArg == secondArg || secondArg==0){
            System.out.println(3*(firstArg));
        }
        else
        {
              //  System.out.println(minDistance+3*minDistance+maxDistance*2);
            System.out.println(3*firstArg+minDistance);
        }
    }
}
