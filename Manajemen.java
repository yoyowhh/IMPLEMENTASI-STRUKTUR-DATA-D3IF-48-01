import java.util.LinkedList;
import java.util.Queue;

public class Manajemen { 
    private Queue<String> queueList;
    private int antrianSelesaiCounter;

    public Manajemen() { 
    this.queueList = new LinkedList<>(); 
    this.antrianSelesaiCounter = 0;
    } 

    public void enqueue(String nama) { 
        queueList.add(nama); 
    } 
 
    public void dequeue()  { 
        String nama = queueList.poll(); 
        System.out.println(nama+" selesai antri");
        antrianSelesaiCounter++;
    } 
 
    public void printQueue() { 
        for (String nama: queueList) { 
        System.out.println(nama + " "); 
        } 
    }         
} 