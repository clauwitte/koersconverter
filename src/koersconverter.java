import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class koersconverter {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        double currencyDollar = 0.902981;
        double currencyEuro = 1.003597;
        double euro;
        double dollar;
        double output;
        boolean userWantsMore = true;
        String newTry;
        String saveData;
        List<Double> myDataConversion;

        do {
            String input = getChoiceCurrencyInput();

            if (input.equals("euro")) {
                output = convertToDollar(currencyDollar);
                saveData = getSaveConversionInput();
               //In progress
                /*myDataConversion = saveData(saveData, output);
                System.out.println("You current data is: " + myDataConversion.toString());*/
                newTry = getTryAgainInput();
                userWantsMore = doTryAgain(newTry);
                while(!userWantsMore){
                    newTry = getTryAgainInput();
                    userWantsMore = doTryAgain(newTry);
                }


            } else if (input.equals("dollar")) {
                output = convertToEuro(currencyEuro);
               /* saveData = getSaveConversionInput();
                saveData(saveData, output);*/
                newTry = getTryAgainInput();
                userWantsMore = doTryAgain(newTry);
                while(!userWantsMore){
                    newTry = getTryAgainInput();
                    userWantsMore = doTryAgain(newTry);
                }
            } else {
                System.out.println("Please, choose a valid answer");
            }

        } while (userWantsMore);
    }

    public static String getChoiceCurrencyInput() {
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

    public static boolean doTryAgain(String inputAnswerTryAgain) {
        boolean userWantsMore = false;

        if (inputAnswerTryAgain.equals("y")) {
            userWantsMore = true;
        } else if (inputAnswerTryAgain.equals("n")) {
            System.out.println("See you next time!");
            System.exit(0);;
        } else {
            System.out.println("Write a valid answer");
           /* do {
                inputAnswerTryAgain = getTryAgainInput();
            } while (!inputAnswerTryAgain.equals("y") & !inputAnswerTryAgain.equals("n"));*/
            userWantsMore = false;
        }
        return userWantsMore;
    }

    public static List <Double> saveData (String inputSaveConversionAnswer, double output){
        List<Double>saveData = new ArrayList<>();
        if(inputSaveConversionAnswer.equals("y")){
            saveData.add(output);
        } else if (inputSaveConversionAnswer.equals("n")){
            System.out.println("No problemo");
        } else {
            do {
                System.out.println("Write a valid answer");
                inputSaveConversionAnswer = getSaveConversionInput();
            }while (!inputSaveConversionAnswer.equals("y") & !inputSaveConversionAnswer.equals("n"));
        }
        return saveData;

    }

    public static double doMath(double rate, double amount){
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
    }
}