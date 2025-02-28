public class MusikTradisional implements Comparable<MusikTradisional>{
    private String kode; 
    private String nama; 
    private String kategori;
    private int harga; 
    private int  stok;
 
    public MusikTradisional(String kode, String nama, String kategori, int harga, int stok) { 
        this.kode = kode; 
        this.nama = nama; 
        this.kategori = kategori; 
        this.harga = harga; 
        this.stok = stok; 
    } 

    public String getKode() { 
        return kode; 
    } 
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() { 
        return kategori; 
    } 
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() { 
        return harga; 
    } 
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() { 
        return stok; 
    }
    public void setStok(int stok) {
        this.stok = stok;
    } 
    

    @Override
    public String toString() {
        return "kode:" + kode + ", Nama:" + nama + ", kategori:" + kategori + ", harga:" + harga + ", stok:" + stok;
    }

    @Override
    public int compareTo(MusikTradisional o) {
        return this.kode.compareTo(o.getKode());
    
    }
}
