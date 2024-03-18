package itcs209.App;

public class PremiumSeat extends SimpleSeat{
    private double discount;
    public PremiumSeat(char label, int number, int amount, double discount) {
        super(label, number, amount);
        this.discount = discount;
    }

    public double calDiscount(){
        if(discount>0){
            discount = super.calTotal()*0.50;
        }
        return (double) Math.round(discount*100)/100;
    }

    public int calAmount(){
        return (int) (super.calTotal()-calDiscount());
    }

    @Override
    public String toString() {
        return String.format(super.toString()+"\n(discount: %d%s)  %s -%.2f",(int) discount,"%","", calDiscount());
    }
}
