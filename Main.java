public class Main {
    public static void main(String[] args) {
        Toko<MusikElektronik> MusikElektronikList = new Toko<>(5);
        Toko<MusikTradisional> MusikTradisionalList = new Toko<>(5);

        MusikElektronik MusikElektronik1 = new MusikElektronik("E001", "Gitar Elektrik", "Elektrik", 10000000, 6);
        MusikElektronik MusikElektronik2 = new MusikElektronik("E002", "Keyboard Elektrik", "Elektrik", 8000000, 8);
        MusikElektronik MusikElektronik3 = new MusikElektronik("E003", "Bass Elektrik", "Elektrik", 7000000, 12);
        MusikElektronik MusikElektronik4 = new MusikElektronik("E004", "Piano Elektrik", "Elektrik", 12000000, 10);
        MusikElektronik MusikElektronik5 = new MusikElektronik("E005", "Flute Elektrik", "Elektrik", 39000000, 5);
        
        MusikElektronikList.addData(MusikElektronik1);
        MusikElektronikList.addData(MusikElektronik2);
        MusikElektronikList.addData(MusikElektronik3);
        MusikElektronikList.addData(MusikElektronik4);
        MusikElektronikList.addData(MusikElektronik5);
        
        System.out.println("Data Alat Musik MusikElektronik");
        MusikElektronikList.display();
        System.out.println();

        MusikTradisional MusikTradisional1 = new MusikTradisional("T001", "Angklung", "MusikTradisional", 200000, 14);
        MusikTradisional MusikTradisional2 = new MusikTradisional("T002", "Gamelang", "MusikTradisional", 90000, 9);
        MusikTradisional MusikTradisional3 = new MusikTradisional("T003", "Sasando", "MusikTradisional", 800000, 17);
        MusikTradisional MusikTradisional4 = new MusikTradisional("T004", "Rebab", "MusikTradisional", 400000, 2);
        MusikTradisional MusikTradisional5 = new MusikTradisional("T005", "Suling", "MusikTradisional", 190000, 8);
        
        MusikTradisionalList.addData(MusikTradisional1);
        MusikTradisionalList.addData(MusikTradisional2);
        MusikTradisionalList.addData(MusikTradisional3);
        MusikTradisionalList.addData(MusikTradisional4);
        MusikTradisionalList.addData(MusikTradisional5);
        
        System.out.println("Data Alat Musik MusikTradisional");
        MusikTradisionalList.display();
        System.out.println();

        System.out.println("Data Setelah Diubah MusikElektronik");
        MusikElektronik penggantiMusikElektronik = new MusikElektronik("E006", "Saxophone Elektrik", "Elektrik", 19000, 21);
        MusikElektronikList.setData(MusikElektronik2, penggantiMusikElektronik);

        MusikElektronikList.removeData(MusikElektronik1);
        MusikElektronikList.displaySort();

        System.out.println("Data Setelah Diubah MusikTradisional");
        MusikTradisional penggantiMusikTradisional = new MusikTradisional("T006", "Siter", "MusikTradisional", 178000, 11);
        MusikTradisionalList.setData(MusikTradisional1, penggantiMusikTradisional);

        MusikTradisionalList.removeData(MusikTradisional2);
        MusikTradisionalList.displaySort();
    }
}