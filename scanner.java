import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ID and Score: ");
        int id = sc.nextInt();       // Parses integer
        double score = sc.nextDouble(); // Parses double
        
        System.out.println("ID: " + id + " | Score: " + score);
        sc.close();
    }
}
