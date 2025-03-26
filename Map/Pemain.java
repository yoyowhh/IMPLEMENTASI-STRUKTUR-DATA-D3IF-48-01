public class Pemain {
    private String nama;
    private int umur;
    private String posisi;
    private int nomorPemain;

    public Pemain(String nama, int umur, String posisi, int nomorPemain) {
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
        this.nomorPemain = nomorPemain;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPosisi() {
        return posisi;
    }

    public int getNomorPemain() {
        return nomorPemain;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 11;
        int hash = 0;
        for(int i = 0; i < nomorPemain; i++) {
            hash = HASH_MULTIPLIER * hash + nomorPemain;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        Pemain pemain = (Pemain) obj;
        return nomorPemain == pemain.nomorPemain;
    }

    @Override
    public String toString() {
        return "Pemain(" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", posisi='" + posisi + '\'' +
                ",nomorPemain=" +nomorPemain +
                ')';
    }

}