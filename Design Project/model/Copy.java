package model;


/**
 * Lav en beskrivelse af klassen Copy her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Copy
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private int serialNumber;
    private String purchaseDate;
    private int purchasePrice;
    

    /**
     * Konstruktør for objekter af klassen Copy
     */
    public Copy(int serialNumber, String purchaseDate, int purchasePrice)
    {
       this.serialNumber = serialNumber;
       this.purchaseDate = purchaseDate;
       this.purchasePrice = purchasePrice;
       
    }

    public int getSerialNumber(){
        return serialNumber;
    }
    public String getPurchaseDate() {
        return purchaseDate;
    }
    public int getPurchasePrice() {
        return purchasePrice;
    }
    }

