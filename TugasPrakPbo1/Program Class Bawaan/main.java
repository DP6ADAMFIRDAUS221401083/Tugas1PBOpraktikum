import java.util.Random;

public class main {
    public static void main(String[] args) {
        
        Random random = new Random();

        int angkaAcak = random.nextInt(100) + 1;
        System.out.println("Angka acak: " + angkaAcak);
    }
}
