import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigDecimal;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class koersconverter {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        double currencyDollar = 0.902981;
        double currencyEuro = 1.003597;
        double euro;
        double dollar;
        double output;
        boolean userWantsMore = false;

        do {
            /*Scanner choiceCurrency = new Scanner(System.in);
            System.out.println("Choose input Euro or Dollar");
            String input = choiceCurrency.nextLine().toLowerCase();*/
            String input = getInput();

            if (input.equals("euro")) {
                System.out.println("Write your amount in euro: ");
                Scanner euroInput = new Scanner(System.in);
                euro = euroInput.nextDouble();
                output = currencyDollar * euro;
                System.out.println(euro + " is " + output + " in dollar");
                System.out.println("Want to try again? Y/N");
                Scanner userAnswer = new Scanner(System.in);
                String answer = userAnswer.nextLine().toLowerCase();
                if (answer.equals("y")) {
                    userWantsMore = false;
                } else if (answer.equals("n")) {
                    userWantsMore = true;
                    System.out.println("See you next time!");
                } else {
                    System.out.println("Write a valid answer");
                }
            } else if (input.equals("dollar")){
                System.out.println("Write your amount in dollar:");
                Scanner dollarInput = new Scanner(System.in);
                dollar = dollarInput.nextDouble();
                output = currencyEuro * dollar;
                System.out.println(dollar + " is " + output + " in euro");
                System.out.println("Want to try again? Y/N");
                Scanner userAnswer = new Scanner(System.in);
                String answer = userAnswer.nextLine().toLowerCase();
                if (answer.equals("y")) {
                    userWantsMore = false;
                } else if (answer.equals("n")) {
                    userWantsMore = true;
                    System.out.println("See you next time!");
                } else {
                    System.out.println("Write a valid answer");
                }

            } else {
                System.out.println("Please, choose a valid answer");

            }

        } while (!userWantsMore);
    }

   public static String getInput(){
       Scanner choiceCurrency = new Scanner(System.in);
       System.out.println("Choose input Euro or Dollar");
       return choiceCurrency.nextLine().toLowerCase();
    }
}

