

public class HashSet {
    private Node[] buckets;
    private int size;
    private int pemainUtama;

    public HashSet() {
        this(5);
    }

    public HashSet(int bucketsLength) {
        buckets = new Node[bucketsLength];
        size = 0;
        pemainUtama = 0;
    }

    //Method hash(Object x)
    public int hash(Object x) {
        int h = x.hashCode();
        if (h < 0) h = -h;
        return h % buckets.length;
    }

    //Method contains(Object x) 
    public boolean contains(Object x) {
        Node iterator = buckets[hash(x)];
        while (iterator != null) {
            if (iterator.data.equals(x)) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    //Method size
    public int size() {
        return size;
    }

    //Method add(Object x)
    public boolean add(Object x) {
        if (pemainUtama < 3) {
            if (contains(x)) {
                return false;
            }
            Node newNode = new Node(x);
            newNode.next = buckets[hash(x)];
            buckets[hash(x)] = newNode;
            size++;
            pemainUtama++;
            return true;
        } else {
            if (contains(x)) {
                return false;
            }
            Node newNode = new Node(x);
            newNode.next = buckets[hash(x)];
            buckets[hash(x)] = newNode;
            size++;
            return true;
        }
    }

    //Method remove(Object x)
    public boolean remove(Object x) {
        Node iterator = buckets[hash(x)];
        Node previous = null;

        while (iterator != null) {
            if (iterator.data.equals(x)) {
                if (previous == null) {
                    buckets[hash(x)] = iterator.next;
                } else {
                    previous.next = iterator.next;
                }
                size--;
                if (pemainUtama > 0) {
                    pemainUtama--;
                }
                return true;
            }
            previous = iterator;
            iterator = iterator.next;
        }

        return false;
    }

    //Method print anggota tim
    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator != null) {
                System.out.printf("Anggota %d : ", i);
                while (iterator != null) {
                    System.out.print(iterator.data + " ");
                    iterator = iterator.next;
                }
                System.out.println();
            }
        }
    }

    //Method print pemain utama
    public void printPemainUtama () {
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator != null) {
                while(iterator.next != null) {
                    iterator = iterator.next;
                }
            System.out.println(iterator.data + " ");
                
            }
        }
    }

    //Method print pemain cadangan
    public void printPemainCadangan () {
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator == null) {
                continue;
            }
            while(iterator.next != null) {
                System.out.print(iterator.data + " ");
                iterator = iterator.next;
            }
            System.out.println();
            
        }
    }
}