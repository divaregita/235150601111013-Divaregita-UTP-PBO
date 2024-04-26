public class Ticket {
    
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }

    public Movie movie() {
        return movie;
    }
    public int studioNumber() {
        return studioNumber;
    }
    public double price() {
        return price;
    }
    public String seat() {
        return seat;
    }
}
