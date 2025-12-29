import java.util.Scanner;

public class AutoPasswordRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordAnalyzer analyzer = new PasswordAnalyzer();

        System.out.println("======================================");
        System.out.println("      PASSWORD STRENGTH CHECKER");
        System.out.println("======================================");

        showGuidelines();
        DummyDatabase.showExamples();

        boolean isStrong = false;

        do {
            System.out.print("\nEnter password: ");
            String password = sc.nextLine();

            isStrong = analyzer.analyze(password);

            if (!isStrong) {
                System.out.println("\n Password is not strong. Please try again.");
            }

        } while (!isStrong);

        System.out.println("\n Strong password accepted. Access granted.");
        sc.close();
    }

    static void showGuidelines() {
        System.out.println("\nGuidelines for a Strong Password:");
        System.out.println("- Minimum 8 characters");
        System.out.println("- At least one uppercase letter (A-Z)");
        System.out.println("- At least one lowercase letter (a-z)");
        System.out.println("- At least one digit (0-9)");
        System.out.println("- At least one special character (@, #, $, etc.)");
    }
}
