
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