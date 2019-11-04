import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String arguments =   scan.nextLine();
        String [] splitedTails = arguments.split(" ");
        int firstArg = Integer.valueOf(splitedTails[0]);
        int secondArg = Integer.valueOf(splitedTails[1]);

       // System.out.println(firstArg);
       // System.out.println(secondArg);
        BigInteger firstArgBig = BigInteger.valueOf(firstArg);
        BigInteger secondArgBig = BigInteger.valueOf(secondArg);
        BigInteger modVal = BigInteger.valueOf(10^9+7);
        BigInteger two = BigInteger.valueOf(2);

        BigInteger firstCalc = two.modPow(secondArgBig,modVal).subtract(BigInteger.ONE);
        System.out.println(firstCalc.modPow(firstArgBig,modVal));
//        if(secondArg ==1){
//            System.out.println(1);
//        }
//        else{
//            if(firstArg==1){
//                System.out.println(two.modPow(BigInteger.valueOf(secondArg),modVal).subtract(BigInteger.ONE));
//            }
//            else
//            {
//                BigInteger firstCalc = secondArgBig.modPow(firstArgBig,modVal);
//                BigInteger  secondCalc = two.modPow(secondArgBig.subtract(BigInteger.ONE),modVal);
//                BigInteger thirdCalc = secondCalc.modPow(firstArgBig,modVal);
//                System.out.println(firstCalc.add(thirdCalc).add(BigInteger.ONE));
//            }
//        }


    }
}
