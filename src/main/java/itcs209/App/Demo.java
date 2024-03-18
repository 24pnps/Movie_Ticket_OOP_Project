package itcs209.App;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo implements Comparable<Demo>{
    private final ProgramMovie movieProgram;
    //final
    public Demo(ProgramMovie movieProgram) {
        this.movieProgram = movieProgram;
    }

    public static void main(String[] args) throws IOException {

        Demo obj[] = new Demo[4];
        //Insert elements in the objects
        obj[0] = new Demo(new ProgramMovie("Thor", 12));
        obj[1] = new Demo(new ProgramMovie("Red Panda", 11));
        obj[2] = new Demo(new ProgramMovie("Minion", 10));
        obj[3] = new Demo(new ProgramMovie("Captain America", 14));
        // sort the array
        Arrays.sort(obj);
        //print Movie name and showtime
        for (Demo o : obj) {
            System.out.println("Movie name: " + o.movieProgram.getName() + ", Showtime: " + o.movieProgram.getShowtime() + ":" + o.movieProgram.getShowtime());
        }

        File inputFile = new File("/Users/aekchanin/Documents/ITCS209/FinalProject/src/main/java/itcs209/App/input.txt");
        File outputFile = new File("output.txt");

        Output out = new Output();
        out.writeToFile(outputFile);
        out.readFromFile(inputFile);
    }

    @Override
    public int compareTo(Demo o) {
        if (this.movieProgram.getShowtime() > o.movieProgram.getShowtime()) {
            return 1;
        } else if (this.movieProgram.getShowtime() < o.movieProgram.getShowtime()) {
            return -1;
        } else {
            return 0;
        }
    }
}
