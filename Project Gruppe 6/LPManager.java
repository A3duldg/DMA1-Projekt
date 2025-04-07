import java.util.*; // Includes Date, List, ArrayList, etc.

// Friend class to store friend details
class Friend {
    private String name;
    private String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }

    // Update friend's details
    public void updateInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Friend{Name='" + name + "', Phone='" + phone + "'}";
    }
}

// LP class represents a vinyl record (can have multiple copies)
class LP {
    private static int copyCounter = 1; // Unique copy ID for each LP instance
    private String title;
    private String artist;
    private int copyId;

    public LP(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.copyId = copyCounter++; // auto-increment copy ID
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getCopyId() { return copyId; }

    // Update LP details
    public void updateInfo(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "LP{ID=" + copyId + ", Title='" + title + "', Artist='" + artist + "'}";
    }
}

// Loan class tracks which LP is loaned to which friend and its return status
class Loan {
    Friend friend;
    LP lp;
    Date loanDate;          // ✅ Date now properly imported from java.util
    boolean isReturned;

    public Loan(Friend friend, LP lp) {
        this.friend = friend;
        this.lp = lp;
        this.loanDate = new Date(); // sets current date as loan date
        this.isReturned = false;    // default to not returned
    }

    // Mark LP as returned
    public void markReturned() {
        isReturned = true;
    }

    public boolean isReturned() {
        return isReturned;
    }

    @Override
    public String toString() {
        return "Loan{LP=" + lp + ", Borrower=" + friend.getName() + ", Date=" + loanDate + ", Returned=" + isReturned + "}";
    }
}

// LPManager class contains core system logic for managing friends, LPs, and loans
public class LPManager {
    private List<Friend> friends = new ArrayList<>();
    private List<LP> lps = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    // Add a new friend to the system
    public void addFriend(String name, String phone) {
        friends.add(new Friend(name, phone));
    }

    // Search for a friend by name
    public Friend searchFriend(String name) {
        return friends.stream()
                      .filter(f -> f.getName().equalsIgnoreCase(name))
                      .findFirst().orElse(null);
    }

    // Update existing friend's information
    public void updateFriend(String oldName, String newName, String newPhone) {
        Friend friend = searchFriend(oldName);
        if (friend != null) {
            friend.updateInfo(newName, newPhone);
        }
    }

    // Remove a friend from the system
    public void deleteFriend(String name) {
        friends.removeIf(f -> f.getName().equalsIgnoreCase(name));
    }

    // Add a new LP copy to the collection
    public void addLP(String title, String artist) {
        lps.add(new LP(title, artist));
    }

    // Search for LPs by title (returns all matching copies)
    public List<LP> searchLP(String title) {
        List<LP> result = new ArrayList<>();
        for (LP lp : lps) {
            if (lp.getTitle().equalsIgnoreCase(title)) {
                result.add(lp);
            }
        }
        return result;
    }

    // Update LP information by copy ID
    public void updateLP(int copyId, String newTitle, String newArtist) {
        for (LP lp : lps) {
            if (lp.getCopyId() == copyId) {
                lp.updateInfo(newTitle, newArtist);
                break;
            }
        }
    }

    // Delete an LP copy by copy ID
    public void deleteLP(int copyId) {
        lps.removeIf(lp -> lp.getCopyId() == copyId);
    }

    // Register a loan: LP copy is borrowed by a friend
    public void loanLP(String friendName, int copyId) {
        Friend friend = searchFriend(friendName);
        LP lpToLoan = null;
        for (LP lp : lps) {
            if (lp.getCopyId() == copyId) {
                lpToLoan = lp;
                break;
            }
        }

        if (friend != null && lpToLoan != null) {
            loans.add(new Loan(friend, lpToLoan));
        }
    }

    // Mark an LP copy as returned
    public void returnLP(int copyId) {
        for (Loan loan : loans) {
            if (loan.lp.getCopyId() == copyId && !loan.isReturned()) {
                loan.markReturned();
                break;
            }
        }
    }

    // Display all loan records
    public void showLoans() {
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }

    // Main method to demonstrate features of the system
    public static void main(String[] args) {
        LPManager manager = new LPManager();

        // Add friends
        manager.addFriend("Alice", "123-456");
        manager.addFriend("Bob", "789-000");

        // Add LPs (multiple copies of same title are allowed)
        manager.addLP("Abbey Road", "The Beatles");
        manager.addLP("Abbey Road", "The Beatles"); // second copy
        manager.addLP("Thriller", "Michael Jackson");

        // Loan LPs to friends
        manager.loanLP("Alice", 1);
        manager.loanLP("Bob", 2);

        // Show all loans
        manager.showLoans();

        // Return one LP
        manager.returnLP(1);
        System.out.println("\nAfter returning LP 1:");
        manager.showLoans();
    }
}