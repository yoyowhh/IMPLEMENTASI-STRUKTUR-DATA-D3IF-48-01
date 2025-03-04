public class Resep {
    String namaResep;
    String bahanUtama;
    int waktuMemasak;

    public Resep (String namaResep, String bahanUtama, int waktuMemasak){
        this.namaResep = namaResep;
        this.bahanUtama = bahanUtama;
        this.waktuMemasak = waktuMemasak;
    }

    public String getNamaResep(){
        return namaResep;
    }
    public void setNamaResep(String namaResep) {
        this.namaResep = namaResep;
    }

    public String getbahanUtama(){
        return bahanUtama;
    }
    public void setbahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }
    
    public int getwaktuMemasak() { 
        return waktuMemasak; 
    } 
    public void setwaktuMemasak(int waktuMemasak) {
        this.waktuMemasak = waktuMemasak;
    }

    @Override
    public String toString() {
        return "\nNama Resep" + namaResep + "\nBahan Utama" + bahanUtama + "\nWaktu Memasak" + waktuMemasak;
    }
}