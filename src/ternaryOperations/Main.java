package ternaryOperations;

public class Main {
    public static void main(String[] args) {
        // Bir sayının pozitif mi negatif mi olduğunu kontrol etme
        int num = 10;
        String result = num >= 0 ? "Pozitif" : "Negatif";
        System.out.println(result); // Çıktı: "Pozitif"

        int x = 5, y = 10;
        int max = (x > y) ? x : y;
        System.out.println("Maximum değer: " + max); // Çıktı: 10

        int num1 = 7;
        String result1 = (num % 2 == 0) ? "Çift" : "Tek";
        System.out.println(result); // Çıktı: "Tek"

        String str = "Hello";
        String result2 = (str.isEmpty()) ? "Boş" : "Dolu";
        System.out.println(result); // Çıktı: "Dolu"
    }
}
