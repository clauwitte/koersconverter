import java.util.Scanner;

public class DoCurrencyMath {
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
