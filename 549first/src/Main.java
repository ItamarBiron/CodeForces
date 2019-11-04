import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String length = scan.nextLine();
        String allString = scan.nextLine();
        String[] splitedTails = allString.split(" ");
        int lastZeroIndex =Integer.valueOf(length);
        int lastOneIndex =lastZeroIndex;
        for( int i =0 ; i < Integer.valueOf(length);i++){
            if(Integer.valueOf(splitedTails[i])==0){
                lastZeroIndex = i;
            }
            else
                lastOneIndex =i;
        }
        System.out.println(Math.min(lastOneIndex,lastZeroIndex)+1);
        //System.out.println(Arrays.toString(splitedTails));
    }
}
