// Kelas TreeNode yang merepresentasikan satu node dalam BST
class TreeNode<E extends Comparable<E>> {
    private TreeNode<E> leftNode; // Child kiri
    private E data; // Nilai node
    private TreeNode<E> rightNode; // Child kanan

    // Konstruktor untuk inisialisasi node
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // Awalnya tidak memiliki anak
    }

    // Getter untuk mendapatkan data node
    public E getData() {
        return data;
    }

    // Getter untuk mendapatkan child kiri
    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    // Getter untuk mendapatkan child kanan
    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    // Metode untuk menyisipkan nilai ke dalam BST
    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) { // Jika nilai lebih kecil, masuk ke kiri
            if (leftNode == null) {
                leftNode = new TreeNode<>(insertValue);
        } else {
                leftNode.insert(insertValue);
        }
    } else if (insertValue.compareTo(data) > 0) { // Jika nilai lebih besar, masuk ke kanan
        if (rightNode == null) {
            rightNode = new TreeNode<>(insertValue);
        } else {
            rightNode.insert(insertValue);
        }
    }
}
    // Method untuk menghitung tinggi pohon dari node ini
    public int height() {
        int leftHeight = (leftNode == null) ? 0 : leftNode.height();
        int rightHeight = (rightNode == null) ? 0 : rightNode.height();
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Method untuk mendapatkan nilai terkecil di subtree ini
    public E findMin() {
        if (leftNode == null) {
            return data;
        } else {
            return leftNode.findMin();
        }
    }

    // Method untuk mendapatkan nilai terbesar di subtree ini
    public E findMax() {
        if (rightNode == null) {
            return data;
        } else {
            return rightNode.findMax();
        }
    }
}