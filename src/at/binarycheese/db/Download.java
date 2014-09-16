package at.binarycheese.db;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * Created by Dominik on 16.09.2014.
 */
public class Download {

    private GregorianCalendar extractDate;
    private String Titel;
    private GregorianCalendar Until;
    private int Priority;
    private boolean EmailSent;
    private long User;
    private int priority;
    private boolean neu;
    private String language;

    public Download(GregorianCalendar extractDate, long ID, String titel, String bemerkung, String downloadURL, GregorianCalendar until, int priority, boolean emailSent, long user, boolean neu, long language_ID) {

        private final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        setExtractDate();   //Extract Date is the Moment of Creation
        setTitel();    //Just set here a random Title
        setUntil();     //Set Date from 1 to 100 Days till today
        setPriority();
        setEmailSent(); // Set Email to 80% to not sent and 20% to sent
        setUderID();    //Set a random UserID between 1 and 10000000
        setNeu();       //Set new to 84% are new entries sincle last lookup
        setLanguage(); //Set a random language: DE,EN,ES,IT,FR,RU
    }

    private void setExtractDate() {
        this.extractDate = new GregorianCalendar();
    }

    private void setTitel() {
        len = (int)Math.Random()*28+2;

        Random rnd = new Random();
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        this.Titel = sb.toString();
    }

    private void setUntil() {
        this.Until = new GregorianCalendar().add(Calendar.DAY_OF_MONTH, (int)Math*Random()*100);

    }

    private void setPriority() {
        int number = (int)Math.Random()*100;

        if(number < 62) {
            this.priority = 3;  //Unnecessary important
        } else if (number >= 62 && number < 92) {
            this.priority = 2;  //Middle important
        } else{
            this.priority = 1; //Most important priority;
        }
    }

    private void setNeu() {
        if(Math.Random()*100 < 84) {
            this.neu = false;
        } else {
            this.neu = true;
        }
    }

    private void setEmailSent() {
        if(Math.Random()*100 <= 80) {
            this.EmailSent = false;
        } else {
            this.EmailSent = true;
        }
    }

    private void setLanguage() {
        switch((int)Math.Random()*11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: language = "DE";
                break;
            case 5:
            case 6: language = "EN";
                break;
            case 7: language = "ES";
                break;
            case 8: language = "IT";
                break;
            case 9: language= " FR";
                break;
            case 10: language = "RU";
                break;
            default: language = "DE";
                break;
        }


    }

    private void setUderID() {
        this.user = (long)(Math.Random()*10000000)+1;
    }

    @Override
    public String toString() {
        return "Download{" +
                "extractDate=" + extractDate +
                ", Titel='" + Titel + '\'' +
                ", Until=" + Until +
                ", Priority=" + Priority +
                ", EmailSent=" + EmailSent +
                ", User=" + User +
                ", priority=" + priority +
                ", neu=" + neu +
                ", language='" + language + '\'' +
                '}';
    }

    //Getters


    public GregorianCalendar getExtractDate() {
        return extractDate;
    }

    public String getTitel() {
        return Titel;
    }

    public GregorianCalendar getUntil() {
        return Until;
    }

    public int getPriority() {
        return Priority;
    }

    public boolean isNeu() {
        return neu;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isEmailSent() {
        return EmailSent;
    }

    public long getUser() {
        return User;
    }
}