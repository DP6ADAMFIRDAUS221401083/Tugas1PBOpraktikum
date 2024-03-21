class Kucing {
    
    String nama;
    int umur;
    String jenisKelamin;
    String warna;

   
    public Kucing(String nama, int umur, String jenisKelamin, String warna) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.warna = warna;
    }

    
    public String suara() {
        return "Meow!";
    }

    
    public String tidur() {
        return this.nama + " sedang tidur.";
    }

   
    public String makan() {
        return this.nama + " sedang makan.";
    }

    
    public String bermain() {
        return this.nama + " sedang bermain.";
    }
}
public class main{
    public static void main(String[] args) {
        
        Kucing kucing1 = new Kucing("Tom", 3, "Jantan", "Abu-abu");
        Kucing kucing2 = new Kucing("Mimi", 2, "Betina", "Putih");
        Kucing kucing3 = new Kucing("Whiskers", 4, "Jantan", "Cokelat");

       
        System.out.println(kucing1.suara());
        System.out.println(kucing2.makan());
        System.out.println(kucing3.tidur());
        System.out.println(kucing2.bermain());
    }
}
