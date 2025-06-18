public class WorkOrder implements Comparable { 
    private int priority; 
    private String description; 

    public WorkOrder(int aPriority, String aDescription) { 
        priority = aPriority; 
        description = aDescription; 
    } 
    public String toString() { 
        return priority + "," + description; 
    } 
    public int compareTo(Object otherObject) { 
        WorkOrder other = (WorkOrder) otherObject; 
        if (priority < other.priority) return -1; 
        if (priority > other.priority) return 1; 
        return 0; 
    } 
}