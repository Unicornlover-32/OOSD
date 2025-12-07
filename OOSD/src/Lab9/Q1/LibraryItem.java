package Lab9.Q1;

public class LibraryItem  {
    private String type;
    private String ID;

    public LibraryItem(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", ID: " + ID;
    }
}
