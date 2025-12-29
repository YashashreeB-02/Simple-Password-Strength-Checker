import java.util.ArrayList;

public class PasswordResult {

    public static boolean display(int score, ArrayList<String> missing) {

        System.out.println("\nPassword Strength Result:");

        if (score <= 2) {
            System.out.println("Strength: Weak");
        } else if (score <= 4) {
            System.out.println("Strength: Medium");
        } else {
            System.out.println("Strength: Strong");
            return true;
        }

        System.out.println("\nTo make your password stronger, you should:");
        for (String m : missing) {
            System.out.println("- " + m);
        }

        return false;
    }
}
