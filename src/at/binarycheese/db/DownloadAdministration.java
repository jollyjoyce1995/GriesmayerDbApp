package at.binarycheese.db;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Dominik on 16.09.2014.
 */
public class DownloadAdministration {

    private int rows;
    private ArrayList<Download> downloads;
    private GregorianCalendar extractDate;

    public DownloadAdministration(int year, int month, int day, int numberOfDays) {

    }

    public DownloadAdministration() {

    }

    public void add(Download d) {
        if(d != null) {
            downloads.add(d);
        } else {
            throw new IllegalArgumentException("Der Übergebene Download hatte den Wert Null");
        }
    }

    public void exportDownloadAdministration() {

    }

    public void generateTestData() {

    }

    @Override
    public String toString() {
        return "DownloadAdministration{" +
                "rows=" + rows +
                ", downloads=" + downloads +
                ", extractDate=" + extractDate +
                '}';
    }
}
