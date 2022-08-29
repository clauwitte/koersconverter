import java.util.Scanner;

public class HandleUserInput {
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
    }
}
