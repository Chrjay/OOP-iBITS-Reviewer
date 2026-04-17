import java.io.Console;

public class SecureLogin {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available (run from a terminal, not an IDE).");
            return;
        }

        String user = console.readLine("Username: ");
        char[] pass = console.readPassword("Password: "); // Input is hidden

        System.out.println("Logged in as: " + user);
    }
}
