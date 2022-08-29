import java.util.ArrayList;
import java.util.Scanner;


public class KoersConverter extends Currency {
    double currencyDollar = getCURRENCY_DOLLAR();
    double currencyEuro = getCURRENCY_EURO();
    double output;
    boolean userWantsMore = true;
    boolean userWantsToSaveData = true;
    ArrayList <Double> data = new ArrayList<>();

     public void convertCurrency(){
         do {

            String input = HandleUserInput.getChoiceCurrencyInput();

            if (input.equals("euro")) {
                output = DoCurrencyMath.convertToDollar(currencyDollar);

                userWantsToSaveData = HandleUserInput.saveData();
                if(userWantsToSaveData) {
                    data.add(output);
                }
                System.out.println("You current data is: " + data);
                userWantsMore = HandleUserInput.doTryAgain();

            } else if (input.equals("dollar")) {
                output = DoCurrencyMath.convertToEuro(currencyEuro);

                userWantsToSaveData = HandleUserInput.saveData();
                if(userWantsToSaveData) {
                    data.add(output);
                }
                System.out.println("You current data is: " + data);
                userWantsMore = HandleUserInput.doTryAgain();

            } else {
                System.out.println("Please, choose a valid answer");
            }

        } while (userWantsMore);
    }

   /* public static String getChoiceCurrencyInput() {
        Scanner choiceCurrency = new Scanner(System.in);
        System.out.println("Choose input: Euro or Dollar?");
        return choiceCurrency.nextLine().toLowerCase();
    }

    public static String getTryAgainInput() {
        System.out.println("Want to try again? Y/N");
        Scanner userAnswer = new Scanner(System.in);
        return userAnswer.nextLine().toLowerCase();
    }

    public static String getSaveConversionInput(){
        System.out.println("Want to save this data? Y/N");
        Scanner userAnswer = new Scanner(System.in);
        return userAnswer.nextLine().toLowerCase();
    }

    public static boolean doTryAgain() {
        String inputAnswerTryAgain;
        while(true){
            inputAnswerTryAgain = getTryAgainInput();
            if (inputAnswerTryAgain.equals("y")) {
                return true;
            } else if (inputAnswerTryAgain.equals("n")) {
                System.out.println("See you next time!");
                return false;
            } else {
                System.out.println("Write a valid answer");
            }
        }
    }

    public static boolean saveData (){
        String inputSaveConversionAnswer;
        while(true){
            inputSaveConversionAnswer = getSaveConversionInput();
            if (inputSaveConversionAnswer.equals("y")) {
                return true;
            } else if (inputSaveConversionAnswer.equals("n")) {
                System.out.println("No problemo");
                return false;
            } else {
                System.out.println("Write a valid answer");
            }
        }
    }*/

    /*public static double doMath(double rate, double amount){
        double output = rate * amount;
        return output;
    }

    public static double convertToDollar(double toDollar){
        System.out.println("Write your amount in euro: ");
        Scanner euroInput = new Scanner(System.in);
        double euro = euroInput.nextDouble();
        double output = doMath(toDollar, euro);
        System.out.println(euro + " is " + output + " in dollar");
        return output;
    }

    public static double convertToEuro(double toEuro){
        System.out.println("Write your amount in dollar:");
        Scanner dollarInput = new Scanner(System.in);
        double dollar = dollarInput.nextDouble();
        double output = doMath(toEuro, dollar);
        System.out.println(dollar + " is " + output + " in euro");
        return output;
    }*/
}