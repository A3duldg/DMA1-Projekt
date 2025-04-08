package Container;


/**
 * Lav en beskrivelse af klassen Friend her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Friend
{
    // har sætter vi parrametrene til at finde vores friends
    private String name;
    private String phone;
    private String address;
    private int postalCode;
    private String city;
    

    // * Konstruktør for objekter af klassen Friend
    
    public Friend(String name, String phone, String address, int postalCode, String city)
    {
        // initialiser instansvariable
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }

    
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public int getPostalCode(){
        return postalCode;
    }
    public String getCity(){
        return city;
    }
}

    
        
    
