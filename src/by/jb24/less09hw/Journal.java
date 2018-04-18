package by.jb24.less09hw;

import java.util.Date;

public class Journal extends PrintedEdition {
    private int releaseNumber;
    private Date releaseDate;

    public Journal(Date dateOfAccept, int id, Date releaseDate, int releaseNumber) {
        super(dateOfAccept, id);
        this.releaseNumber = releaseNumber;
        this.releaseDate = releaseDate;
    }

    public Journal(Date dateOfAccept, int id, String title, int releaseNumber, Date releaseDate) {
        super(dateOfAccept, id, title);
        this.releaseNumber = releaseNumber;
        this.releaseDate = releaseDate;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + "Number: " + releaseNumber + "\nDate: " + releaseDate + "\n";
    }
}
