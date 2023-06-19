package Study_2;

public class Lessen_1_6_11 {
    public static void main(String[] args) {

    }

    public static boolean isGmailOrOutlook(String email) {
        if (!email.contains("@")) {
            return false;
        }
        String[] parts = email.split("@");
        if (parts[1].equalsIgnoreCase("gmail.com") || parts[1].equalsIgnoreCase("outlook.com")) {
            String pattern = "^[a-zA-Z0-9]+$";
            if (parts[0].matches(pattern)) {
                return true;
            }
        }
        return false;
    }
}