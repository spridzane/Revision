package Revision;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ExchangeApp {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        //TODO:declare local variables
        double amt;
        double r;
        double convAmt;

        //TODO:declare objects
        Scanner sc = new Scanner(System.in);
        Exchange conv = new Exchange();

        //TODO:input
        System.out.println("\tPlease enter amount to be converted: ");
        amt = sc.nextDouble();
        //TODO:setMethod to put sc value
        conv.setAmount(amt);
        System.out.println("\tPlease enter the conversion rate: ");
        r = sc.nextDouble();
        //TODO:setMethod
        conv.setRate(r);
        //TODO:process
        conv.calcConversion();
        convAmt = conv.getConversion();
        //TODO:output
        System.out.println(df2.format(amt) + " at a rate of " + r + " is " + df2.format(convAmt));

    }//end main
}//end class
