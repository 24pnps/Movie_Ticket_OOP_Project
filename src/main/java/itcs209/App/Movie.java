package itcs209.App;

public class Movie implements Keep{
    private final String name;
    private String cinema;
    private final int showtime;

    public Movie(String name, String cinema, int showtime) {
        this.name = name;
        this.cinema = cinema;
        this.showtime = showtime;
    }
    //Overload Method
    public Movie(String name, int showtime){
        this.name = name;
        this.showtime = showtime;
    }

    public String getName() {
        return name;
    }

    public String getCinema() {
        return cinema;
    }

    public int getShowtime() {
        return showtime;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    @Override
    public String toString() {
        return "Theater: "+cinema +"\nMovie name: "+ name+"\nShowtime: "+showtime+":"+showtime;
    }

}

