package Revision;

public class CDDiscount {
    private int numCD;
    private int discAmount;

    public CDDiscount() {

    }

    public void setNumCD(int numCD) {
        this.numCD = numCD;

    }

    public void compute() {
        if (numCD > 40){
            discAmount = 50;
        }else if (numCD > 20){
            discAmount = 30;
        }else if(numCD >10){
            discAmount = 20;
        }else{
            discAmount = 0;
        }
    }

    public int getDiscAmount() {
        return discAmount;
    }


}
