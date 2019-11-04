import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String inputInString = scan.nextLine();
        BigInteger input = new BigInteger(inputInString);
        BigInteger answer = BigInteger.ONE;
        BigInteger nine = BigInteger.valueOf(9);
        BigInteger canBeMax = nine.pow(Integer.valueOf(inputInString.length()) - 1);


        /// find the first char that is not 9
        char a = inputInString.charAt(0);
        int firstIndexIsNot9 = -1;
        for (int i = 0; i < inputInString.length(); i++) {
            if (inputInString.charAt(i) != '9' && i != 0 && i !=1) {
                firstIndexIsNot9 = i;
                break;
            }
        }
        //  System.out.println(firstIndexIsNot9);
        if (inputInString.length() == 1) {
            System.out.println(inputInString);
            return;
        }

        if (inputInString.charAt(0) == '1') {
            System.out.println(canBeMax);
            return;
        }


        int firstDigit = Character.getNumericValue((inputInString.charAt(0)));
        int secondDigit = Character.getNumericValue((inputInString.charAt(1)));
        int maxAnswer = Math.max(firstDigit * secondDigit, (firstDigit - 1) * 9);

        if (String.valueOf(input.add(BigInteger.ONE)).charAt(0) != inputInString.charAt(0)) {
            System.out.println(canBeMax.multiply(BigInteger.valueOf(firstDigit)));
            return;
        }

        if (inputInString.length() == 2) {
            System.out.println(maxAnswer);
            return;
        }

//        BigInteger otherCanBeMax = BigInteger.valueOf(firstDigit * (secondDigit - 1))
//                .multiply(nine.pow(Integer.valueOf(inputInString.length()) - 2));

        BigInteger maxWithcorrect;
        if(firstIndexIsNot9 ==-1){
            System.out.println(canBeMax.multiply(BigInteger.valueOf(firstDigit)));
            return;
        }
        if (firstIndexIsNot9 != inputInString.length() - 1 && firstIndexIsNot9!=1) {
            maxWithcorrect = nine.pow(Integer.valueOf(inputInString.length()) - 2).multiply(BigInteger.valueOf(firstDigit * 8));

        } else {
            maxWithcorrect = canBeMax;
        }
      //  BigInteger othermax = (firstDigit*secondDigit)*nine.pow(Integer.valueOf(inputInString.length()) - 2);
        BigInteger OtherMax = BigInteger.ONE;
        for(int i =0 ; i<inputInString.length(); i++){
            int specipicChar =Character.getNumericValue(inputInString.charAt(i));
            OtherMax=OtherMax.multiply(BigInteger.valueOf(specipicChar));
        }
        BigInteger otherCanBeMax = BigInteger.valueOf(firstDigit * (secondDigit - 1))
                .multiply(nine.pow(Integer.valueOf(inputInString.length()) - 2));
        System.out.println(((maxWithcorrect.max(canBeMax)).max(otherCanBeMax)).max(OtherMax));
        // System.out.println(otherCanBeMax.max(canBeMax));

        //   int oneOpstion = Integer.valueOf(inputInString.charAt(0))*

    }
}
