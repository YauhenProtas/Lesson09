package by.jb24.less09hw;

import java.util.Date;

public class Main{

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		PrintedEdition scientificMagazine = new MedicalJournal(new Date(5, 10, 2016), 13, "Cyrgery for newbies", 666, new Date(5, 10, 2013), "Anathomy");
        OutText out = new OutText();
        out.print(scientificMagazine.getId(), scientificMagazine.getAllInfo());
        if (scientificMagazine instanceof MedicalJournal) {
            MedicalJournal scMagazine = (MedicalJournal) scientificMagazine;
            out.print(scMagazine.getResearchField(), scMagazine.getReleaseDate(), scMagazine.getReleaseNumber());
        }
    }
}
