package model;


/**
 * Lav en beskrivelse af klassen Loan her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Loan
{
    
    private int loanNumber;
    private String borrowedDate;
    private String returnDate;
    private boolean status;
    

    /**
     * Konstruktør for objekter af klassen Loan
     */
    public Loan(int loanNumber, String borrowedDate, String returnDate, String status) {
        this.loanNumber = loanNumber;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }
    public int getLoanNumber() {
        return loanNumber;
    }
    
    public String getBorrowedDate() {
        return borrowedDate;
    }
    
    public String getReturnDate() {
        return returnDate;
    }
    public void createloan(int loanNumber, String borrowDate) {
        
    }
    public String addFriendByPhone(String phone) {
        return phone;
    }
    public void addToLoan(Loan l) {
        
    }
    public void setStatus() { 
        this.status = status;
    }
    public void setBorrowedDate() {
        this.borrowedDate = borrowedDate;
    }
}    
