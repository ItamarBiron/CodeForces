import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String length = scan.nextLine();
        String allString = scan.nextLine();
        String[] splitedTails = allString.split(" ");
        BigInteger[] allAmountOfAnyTyep = new BigInteger[Integer.valueOf(length)];
        for (int i = 0; i < allAmountOfAnyTyep.length; i++) {
            allAmountOfAnyTyep[i] = new BigInteger(splitedTails[i]);
        }

        BigInteger sum = allAmountOfAnyTyep[0];
        BigInteger max = BigInteger.ZERO;
        BigInteger lastAdded = BigInteger.ZERO;
        BigInteger[] whatWeTake = new BigInteger[allAmountOfAnyTyep.length];
        for (int j = 0; j < allAmountOfAnyTyep.length; j++) {
            sum = BigInteger.ZERO;
            lastAdded = BigInteger.ZERO;
            for (int i = j; i < allAmountOfAnyTyep.length; i++) {

                if((allAmountOfAnyTyep[i].subtract(BigInteger.ONE)).compareTo(lastAdded)!=-1)
                    if (i == allAmountOfAnyTyep.length - 1 || allAmountOfAnyTyep[i].compareTo(allAmountOfAnyTyep[i + 1]) == -1) {
                        sum = sum.add(allAmountOfAnyTyep[i]);
                        lastAdded = allAmountOfAnyTyep[i];
                    }

                    else {
                        if((allAmountOfAnyTyep[i+1].subtract(BigInteger.ONE)).compareTo(lastAdded)!=-1){
                            sum = sum.add(allAmountOfAnyTyep[i+1].subtract(BigInteger.ONE));
                            lastAdded = allAmountOfAnyTyep[i+1].subtract(BigInteger.ONE);
                        }



                    }

//                else{
//                    sum = BigInteger.ZERO;
//                    lastAdded = BigInteger.ZERO;
//                }
            }
            if (max.compareTo(sum) == -1) {
                max = sum;
            }
        }
        System.out.println(max);

    }
}
