package compareStrings;

public class Main {
    public static void main(String[] args) {
        Compare compare = new Compare();

        System.out.println(compare.areStringsEqualSmell("Seckin", "Tuncay"));
        System.out.println(compare.areStringsEqualsCleanCode("Seckin", "Seckin"));
    }
}
