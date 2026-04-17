import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 1. Create the reader object
        // System.in (Bytes) -> InputStreamReader (Characters) -> BufferedReader (Buffered Text)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            
            // 2. Read a line of text
            String name = reader.readLine(); 

            System.out.print("Enter your age: ");
            // 3. Manual parsing (since it only reads Strings)
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Hello " + name + ", you are " + age + " years old.");

        } catch (IOException e) {
            // Handle potential I/O errors
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle errors if the user enters a non-number for age
            System.out.println("Please enter a valid number for age.");
        }
    }
}
