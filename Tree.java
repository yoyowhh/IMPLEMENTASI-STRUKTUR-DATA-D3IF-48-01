public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root; // Root dari BST

    // Konstruktor
    public Tree() {
        root = null;
    }

    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<>(insertValue); // Buat root jika belum ada
        } else {
            root.insert(insertValue); // Masukkan nilai dengan rekursi
        }
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<E> node) {
        if (node == null)
            return;
        System.out.printf("%s ", node.getData());
        preorderHelper(node.getLeftNode());
        preorderHelper(node.getRightNode());
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<E> node) {
        if (node == null)
            return;
        inorderHelper(node.getLeftNode());
        System.out.printf("%s ", node.getData());
        inorderHelper(node.getRightNode());
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode<E> node) {
        if (node == null)
            return;
        postorderHelper(node.getLeftNode());
        postorderHelper(node.getRightNode());
        System.out.printf("%s ", node.getData());
    }

    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);
        if (hasil) {
            System.out.println("Data ditemukan: " + key);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    private boolean searchBSTHelper(TreeNode<E> node, E key) {
        if (node == null)
            return false;
        if (key.equals(node.getData()))
            return true; // Jika ditemukan
        if (key.compareTo(node.getData()) < 0) {
            return searchBSTHelper(node.getLeftNode(), key); // Cari ke kiri
        } else {
            return searchBSTHelper(node.getRightNode(), key); // Cari ke kanan
        }
    }

    public int height() {
        if (root == null) return 0;
        return root.height();
    }

    public E findMin() {
        if (root == null) return null;
        return root.findMin();
    }

    public E findMax() {
        if (root == null) return null;
        return root.findMax();
    }


}