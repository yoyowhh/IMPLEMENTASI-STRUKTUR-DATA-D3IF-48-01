public class MainManajemen { 
    public static void main(String[] args) { 
        Manajemen add = new Manajemen(); 
 
        add.enqueue("Reimu"); 
        add.enqueue("Marisa");   
        add.enqueue("Keine"); 
        add.enqueue("Mokou");  
        add.enqueue("Eirin");  
   
        System.out.println("Antrian saat ini:");
        add.printQueue(); 
        System.out.println("Ada 5 orang yang sedang antri");
        System.out.println();
        add.dequeue(); 
        add.dequeue(); 
        System.out.println();
        System.out.println("Antrian saat ini:");
        add.printQueue();
        System.out.println("Ada 3 orang yang sedang antri");

    } 
} 