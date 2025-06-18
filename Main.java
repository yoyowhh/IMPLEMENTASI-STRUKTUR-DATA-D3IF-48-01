import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Hologram");
        graph.addVertex("Kontak tim lain");
        graph.addVertex("Properti panggung");
        graph.addVertex("Kostum");
        graph.addVertex("Persiapan panggung");
        graph.addVertex("Pencahayaan");
        graph.addVertex("Pengepasan kostum");
        graph.addVertex("Pembuatan panggung");

        graph.addEdge("Hologram", "Kostum");
        graph.addEdge("Kostum", "Pengepasan kostum");
        graph.addEdge("Kostum", "Pencahayaan");
        graph.addEdge("Kostum", "Pengepasan kostum");
        graph.addEdge("Kontak tim lain", "Pengepasan kostum");
        graph.addEdge("Kontak tim lain", "Persiapan panggung");
        graph.addEdge("Persiapan panggung", "Pembuatan panggung");
        graph.addEdge("Properti panggung", "Kostum");
        graph.addEdge("Properti panggung", "Persiapan panggung");

        List<String> sortedList = graph.topologicalSort();
        
        if (sortedList != null) { 
            System.out.println("Urutan pengerjaan tugas persiapan drama: " + sortedList); 
        } else { 
            System.out.println("Cycle detected in the graph."); 
        } 
    }
}