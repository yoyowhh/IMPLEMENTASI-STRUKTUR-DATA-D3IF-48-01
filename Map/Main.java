import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Pemain> timBlueLock = new HashMap<>();

        // Menambahkan data pemain
        Pemain pemain1 = new Pemain("Isagi Yoichi", 17, "Penyerang", 11);
        Pemain pemain2 = new Pemain("Bachira Meguru", 17, "Penjaga Gawang", 8);
        Pemain pemain3 = new Pemain("Kunigami Rensuke", 18, "Penyerang", 9);
        Pemain pemain4 = new Pemain("Isagi Yoichi", 17, "Penyerang", 11); // Data duplikat

        timBlueLock.put(pemain1.hashCode(), pemain1);
        timBlueLock.put(pemain2.hashCode(), pemain2);
        timBlueLock.put(pemain3.hashCode(), pemain3);
        timBlueLock.put(pemain4.hashCode(), pemain4);

        // Mencetak semua data pemain
        System.out.println("Seluruh Data Pemain:");
        for (Map.Entry<Integer, Pemain> entry : timBlueLock.entrySet()) {
            System.out.println("Kode Pemain : " + entry.getKey() + ", Data Pemain : " + entry.getValue());
        }

        // Membandingkan data pemain
        if (pemain1.equals(pemain4) && pemain1.hashCode() == pemain4.hashCode()) {
            System.out.println("pemain1 dan pemain4 adalah data pemain yang sama");
        } else {
            System.out.println("pemain1 dan pemain4 adalah data pemain yang berbeda");
        }
        
        if (pemain1.equals(pemain2) && pemain1.hashCode() == pemain2.hashCode()) {
            System.out.println("pemain1 dan pemain2 adalah data pemain yang sama");
        } else {
            System.out.println("pemain1 dan pemain2 adalah data pemain yang berbeda");
        }

        //Challenge
        if (timBlueLock.containsKey(pemain1.hashCode())) {
            System.out.println("Data pemain1 ada di dalam timBlueLock");
        } else {
            System.out.println("Data tidak ada di dalam timBlueLock");
        }

        if (timBlueLock.containsKey(123456)) {
            System.out.println("Data pemain4 ada di dalam timBlueLock");
        } else {
            System.out.println("Data tidak ada di dalam timBlueLock");
        }
    }
}