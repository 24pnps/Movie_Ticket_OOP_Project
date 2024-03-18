package itcs209.App;

public class SimpleSeat extends Seat{
    private int price;
    private int price2;
    private int amount;

    public SimpleSeat(char label, int number, int amount) {
        super(label, number);
        this.amount = amount;
    }

    public int getPrice() {
        if (super.getLabel() == 'C' || super.getLabel() == 'D'|| super.getLabel() == 'E') {
            this.setPrice(price);
        }
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public int calTotal(){
        if (super.getLabel() == 'A' || super.getLabel() == 'B') {
            price2 = 200;
            return price2*amount;
        }
        if (super.getLabel() == 'C' || super.getLabel() == 'D'|| super.getLabel() == 'E') {
            price = 150;
        }
        return price*amount;
     }

    public int calAmount(){
        return calTotal();
    }

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
