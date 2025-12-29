import java.util.ArrayList;

public class PasswordAnalyzer {

    public boolean analyze(String password) {

        ArrayList<String> missing = new ArrayList<>();
        int score = 0;

        if (password.length() >= 8) score++;
        else missing.add("Add minimum 8 characters");

        if (password.matches(".*[A-Z].*")) score++;
        else missing.add("Add at least one uppercase letter");

        if (password.matches(".*[a-z].*")) score++;
        else missing.add("Add at least one lowercase letter");

        if (password.matches(".*[0-9].*")) score++;
        else missing.add("Add at least one digit");

        if (password.matches(".*[^a-zA-Z0-9].*")) score++;
        else missing.add("Add at least one special character");

        return PasswordResult.display(score, missing);
    }
}
