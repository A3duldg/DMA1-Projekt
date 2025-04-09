package model;
import java.util.List;
import java.util.ArrayList;


/**
 * Lav en beskrivelse af klassen LoanContainer her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class LoanContainer
{
    private List<Loan> loans = new ArrayList<>();
    private static LoanContainer instance;
    /**
     * Konstruktør for objekter af klassen LoanContainer
     */
    private LoanContainer() {
        ArrayList<Loan> loans = new ArrayList<>();

    }
    private static LoanContainer getInstance() {
        return instance;
    }
    public void addToLoan(Loan l) {
        loans.add();
    }
}
