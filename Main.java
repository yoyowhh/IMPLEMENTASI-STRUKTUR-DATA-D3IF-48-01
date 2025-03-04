import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Resep> linkedList = new SinglyLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep di Depan");
            System.out.println("2. Tambah Resep di Belakang");
            System.out.println("3. Hapus Resep dari Belakang");
            System.out.println("4. Tampilkan Resep");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama resep: ");
                    String namaDepan = scanner.nextLine();
                    System.out.print("Masukkan bahan utama: ");
                    String bahanDepan = scanner.nextLine();
                    System.out.print("Masukkan waktu (menit): ");
                    int waktuDepan = scanner.nextInt();
                    linkedList.insertAtFront(new Resep(namaDepan, bahanDepan, waktuDepan));
                    break;
                case 2:
                    System.out.print("Masukkan nama resep: ");
                    String namaBelakang = scanner.nextLine();
                    System.out.print("Masukkan bahan utama: ");
                    String bahanBelakang = scanner.nextLine();
                    System.out.print("Masukkan waktu (menit): ");
                    int waktuBelakang = scanner.nextInt();
                    linkedList.insertAtBack(new Resep(namaBelakang, bahanBelakang, waktuBelakang));
                    break;
                case 3:
                    linkedList.removeFromBack();
                    System.out.println("Resep terakhir dihapus.");
                    break;
                case 4:
                    linkedList.print();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}