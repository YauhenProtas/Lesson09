package by.jb24.less09hw;

import java.util.Date;

public class MedicalJournal extends Journal {
    private String researchField;

    public MedicalJournal(Date dateOfAccept, int id, String title, int releaseNumber, Date releaseDate, String researchField) {
        super(dateOfAccept, id, title, releaseNumber, releaseDate);
        this.researchField = researchField;
    }

    @Override
    public int getReleaseNumber() {
        return super.getReleaseNumber();
    }

    @Override
    public Date getReleaseDate() {
        return super.getReleaseDate();
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + "Research field is " + researchField + "\n";
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public String getResearchField() {
        return researchField;
    }
}
