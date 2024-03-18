package itcs209.App;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class Output implements Keep, FilePersistence {
    private Scanner in;
    private PrintWriter out;
    private ProgramMovie movieProgram;

    public Output() {

    }

    @Override
    public void writeToFile(File outputFile) throws IOException {
        out = new PrintWriter(outputFile);

    }

    @Override
    public void readFromFile(File inputFile) throws IOException, NoSuchElementException {
        Ticket tic = new Ticket(new Movie("Thor", "1", 12));

        in = new Scanner(inputFile);
        String line = null;
        String cinema = null;
        String line2 = null;
        char label = 0;
        int number = 0;
        String[] splitLine3 = new String[0];
        double discount = 0;

        int numShow = 0;
        while (in.hasNextLine()) {
            line = in.nextLine();
            cinema = "";
            for (int i = 0; i < line.length(); i++) {
                cinema = "";
                if (line.equals("Thor")) {
                    cinema = "1";
                } else if (line.equals("Minion")) {
                    cinema = "2";
                } else if (line.equals("Red Panda")) {
                    cinema = "3";
                } else {
                    cinema = "4";
                }
            }
            line2 = in.nextLine();
            String[] splitLine2 = line2.split(":");
            String numStr = splitLine2[0];
            numShow = Integer.parseInt(numStr);

            String line3 = in.nextLine();
            splitLine3 = line3.split(" ");
            String labelStr = splitLine3[0].substring(0, 1);
            label = labelStr.charAt(0);
            String numberSeat = splitLine3[0].substring(1);
            number = Integer.parseInt(numberSeat);

            String line4 = in.nextLine();
            discount = 0;
            if (Objects.equals(line4, "Membership")) {
                discount = 50;
            }
            if (Objects.equals(line4, "NoMembership")) {
                discount = 0;
            }

        }
        out.println("=========================");
        out.println("      Movie Ticket");
        out.println("-------------------------");
        tic.setMovieName(new Movie(line, cinema, numShow));
        tic.addItem(label, number, splitLine3.length, discount);
        out.println(tic.toString());
        out.println("-------------------------");
        out.println("     Total: " + tic.computeAmount());
        out.println("=========================");
        in.close();
        out.close();

    }

}
