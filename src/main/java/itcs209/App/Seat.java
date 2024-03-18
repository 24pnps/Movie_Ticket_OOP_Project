package itcs209.App;

public class Seat implements Keep{
    private char label;
    private int number;

    public Seat(char label, int number) {
        this.label = label;
        this.number = number;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {

        return String.format("\nSeat: %c%d",label,number);
    }


}
