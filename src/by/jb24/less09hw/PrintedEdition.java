package by.jb24.less09hw;

import java.util.Date;

public class PrintedEdition {
    private Date dateOfAccept;
    private int id;
    private String title;

    public PrintedEdition(Date dateOfAccept2, int id) {
        this.dateOfAccept = dateOfAccept2;
        this.id = id;
    }

    public PrintedEdition(Date dateOfAccept, int id, String title) {
        this.dateOfAccept = dateOfAccept;
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAllInfo() {
        return "Title: '" + title + "'\nAccepted: '" + dateOfAccept + "'\nId: '" + id + "'\n";
    }
}
