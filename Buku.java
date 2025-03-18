public class Buku {
    private String isbn;
    private String judul;
    private String kategori;
    private int harga;
    private String status;
    
    public Buku(String isbn, String judul, String kategori, int harga, String status) {
        this.isbn = isbn;
        this.judul = judul;
        this.kategori = kategori;
        this.harga = harga;
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override 
    public String toString() { 
        return "ISBN='" + isbn + '\'' + ", Judul Buku='" + judul + '\'' + ", Kategori Buku= " + kategori + '\'' + "Harga Buku='" + harga + '\'' + "Status Peminjaman= " + status; 
    }     

    
}
