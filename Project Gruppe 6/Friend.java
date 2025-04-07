
import java.util.*;

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
