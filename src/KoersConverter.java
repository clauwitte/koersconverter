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
}