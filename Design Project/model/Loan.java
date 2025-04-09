package model;


/**
 * Lav en beskrivelse af klassen Loan her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Loan
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private boolean status;
    

    /**
     * Konstruktør for objekter af klassen Loan
     */
    public Loan(int loanNumber, String borrowDate, String returnDate, String status)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    public int getLoanNumber(){
        return loanNumber;
    }
    
    public String getBorrowDate(){
        return borrowDate;
    }
    
    public String getReturnDate(){
        return returnDate;
    }
    public void createloan(int loanNumber, String borrowDate){
        
    }
    public String addFriendByPhone(String phone){
        return phone;
    }
    
}
