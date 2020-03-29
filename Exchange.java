package Revision;

public class Exchange {
    //declare data members - amount, rate, conversion
    private double amount;
    private double rate;
    private double conversion;

    //constructor (can use error example/ Student.java)

    public Exchange() {

    }

    //constructor - amount, rate

    public Exchange(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    //set methods (for amount and rate)

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //calculation = conversion
    public void calcConversion(){
        conversion = amount * rate;
    }

    //get method return conversion

    public double getConversion() {
        return conversion;
    }
}
