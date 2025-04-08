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

    // * Konstruktør for objekter af klassen Friend
    
    public Friend(String name, String phone)
    {
        // initialiser instansvariable
        this.name = name;
        this.phone = phone;
    }

    
    public String getName(){
        return name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void updateFriend (String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    public String showInfo (){
        return "Friend(Name"+ name + "Phone "+ phone +")";
    }
}
    
        
    
