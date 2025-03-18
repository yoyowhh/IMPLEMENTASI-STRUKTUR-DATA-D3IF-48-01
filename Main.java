import java.util.LinkedList;
import java.util.ListIterator; 

public class Main {
    public static void main(String[] args) {
        LinkedList<Buku> listBuku = new LinkedList<>();

        listBuku.add(new Buku("001", "Kancil", "Dongeng", 10000, "Dipinjam"));
        listBuku.addLast(new Buku("002", "Laskar Pelangi", "Novel", 50000, "Tidak Dipinjam"));
        listBuku.addFirst(new Buku("003", "Kancil", "Dongeng", 90000, "Dipinjam"));
        listBuku.addFirst(new Buku("004", "Sangkuriang", "Novel", 88000, "Tidak Dipinjam"));
        listBuku.add(new Buku("005", "Dua Garis Biru", "Novel", 55000, "Dipinjam"));

    
    System.out.println("Daftar Buku: ");
    ListIterator<Buku> iterator = listBuku.listIterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());   
    }

    System.out.println("\nCetak mundur list buku:");
    while (iterator.hasPrevious()) {
        System.out.println(iterator.previous());
    }

    //Penghapusan buku, menghapus buku dari dalam LinkedList berdasarkan ISBN.  
    ListIterator<Buku> iter = listBuku.listIterator();
    while (iter.hasNext()){
        Buku ob = iter.next();
        if (ob.getIsbn().equals("001")){
            iter.remove();
        }
    }

    System.out.println("\nSesudah Hapus Data Buku: ");
    for (Buku item : listBuku){
        System.out.println(item);
    }

    //Mengubah Status 005
    if (iter.hasPrevious()){
        Buku ob = iter.previous();
        ob.setJudul("Moana");
        ob.setKategori("Dongeng");
        ob.setStatus("Tidak Tersedia");
    }
    
    System.out.println("\nSesudah Diubah Status 1: ");
    for (Buku item : listBuku){
        System.out.println(item);
    }

    //Mengubah Status 004
        if (iter.hasPrevious()){
            Buku ob = iter.previous();
            ob.setJudul("Najwa Pecinta Kucing");
            ob.setKategori("Dongeng");
            ob.setStatus("Dipinjam");
        }
        
        System.out.println("\nSesudah Diubah Status 2: ");
        for (Buku item : listBuku){
            System.out.println(item);
        }

    
    }
}
