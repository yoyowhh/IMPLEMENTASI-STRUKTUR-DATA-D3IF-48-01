public class Main {
    public static void main(String[] args) {
        HashSet team = new HashSet(5);

        // Seluruh Anggota tim
        team.add("Ego Jinpachi");
        team.add("Ahmad Faisal");
        team.add("Darren Yohanes");
        team.add("Felix Sutanto");
        team.add("Hansel Gunawan");
        team.add("Hendry Kurniawan");
        team.add("Sae");
        // challenge
        team.add("Bebas");
        team.add("Terserah");
        team.add("Mau");
        team.add("Apa");

        System.out.println("Seluruh Anggota tim:");
        team.print();

        // Khusus pemain utama
        System.out.println("\nPemain Utama:");
        team.printPemainUtama();

        // Khusus pemain cadangan
        System.out.println("\nPemain Cadangan:");
        team.printPemainCadangan();
    }
}
