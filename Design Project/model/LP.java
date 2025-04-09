package model;


/**
 * Lav en beskrivelse af klassen LP her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class LP
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler

    private String artist;
    private String title;
    private int barcode;
    private String publicationDate;
    


    /**
     * Konstruktør for objekter af klassen LP
     */
    public LP(String artist, String title)
    {
        this.artist = artist;
        this.title = title;
        this.barcode = barcode;
        this.publicationDate = publicationDate;


    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    public String publicationDate() {
        return publicationDate;
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     * 
     * @param  y  eksempel på en parameter til en metode
     * @return    summen af x og y 
     */
}

