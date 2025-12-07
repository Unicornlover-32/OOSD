package Lab9.Q1;

public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String ID, String band, String title, int numTracks) {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    @Override
    //Calculate price based on number of tracks
    public void calculatePrice() {
        double price = 0.0;

        if (numTracks < 5) {
            price = 7.0;
        } else if (numTracks <= 10) {
            price = 10.0;
        } else {
            price = 15.0;
        }

        System.out.println("The price of the CD \"" + title + "\" by " + band + " is: $" + price);
    }

    @Override
    public String toString() {
        return super.toString() + ", Band: " + band + ", Title: " + title + ", Tracks: " + numTracks;
    }
}
