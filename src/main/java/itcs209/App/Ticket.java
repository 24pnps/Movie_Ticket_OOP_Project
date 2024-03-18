package itcs209.App;

import java.util.ArrayList;
import java.util.Arrays;

public class Ticket{
    ArrayList<SimpleSeat> item = new ArrayList<>();
    private Movie movieName;

    public Ticket(Movie movieName) {

        this.movieName = movieName;
    }

    public void setMovieName(Movie movieName) {

        this.movieName = movieName;
    }

    public void addItem(char label, int number, int amount) {

        item.add(new SimpleSeat(label, number, amount));
    }

    public void addItem(char label, int number, int amount, double discount) {
        item.add(new PremiumSeat(label, number, amount, discount));
    }

    public String computeAmount() {
        double total = 0;
        for (int i = 0; i < item.size(); i++) {
            total += item.get(i).calAmount();
        }
        String totalStr = String.format("%.2f", total);
        return totalStr;
    }

    @Override
    public String toString() {
        String printMovie = new String();
        printMovie += movieName.toString();
        for (int i = 0; i < item.size(); i++) {
            printMovie += item.get(i);
        }
        return printMovie;
    }
}
