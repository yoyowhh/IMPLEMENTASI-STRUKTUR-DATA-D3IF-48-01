public class Main {
    public static void main(String[] args) {
        MinHeap todoList = new MinHeap();
        
        // Menambahkan pekerjaan dengan deadline
        todoList.add(new WorkOrder(5, "tugas ISD"));
        todoList.add(new WorkOrder(8, "rapat UKM"));
        todoList.add(new WorkOrder(3, "kuis SBD"));

        // Menampilkan pekerjaan terdekat deadline-nya
        System.out.println("Task terdekat yang harus diselesaikan: " + todoList.peek());

        // Menghapus pekerjaan yang sudah selesai
        WorkOrder completed = (WorkOrder) todoList.remove();
        System.out.println(completed + " selesai dilaksanakan");
        System.out.println("berikutnya: " + todoList.peek());
    }
}