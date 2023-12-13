package compareStrings;

public class Compare {
    public Compare() {
    }

    public boolean areStringsEqualSmell(String first, String second) {
        return first.toUpperCase() == second.toUpperCase();
    }

    public boolean areStringsEqualsCleanCode(String first, String second) {
        return first.equalsIgnoreCase(second);
    }
}
