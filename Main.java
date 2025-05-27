public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        int[] values = { 111, 90, 150, 80, 100, 130, 170, 95, 140  };

        //System.out.println("Inserting the following values:");

        for (int value : values) {
            //System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        // System.out.println("\n\nPreorder traversal:");
        // tree.preorderTraversal();
        System.out.println("\n\nInorder traversal:");
        tree.inorderTraversal();
        // System.out.println("\n\nPostorder traversal:");
        // tree.postorderTraversal();

        System.out.println("\n\nNilai Terkecil: " + tree.findMin());

        System.out.println("Nilai Terbesar: " + tree.findMax());

        System.out.println("Tinggi Pohon: " + tree.height());

        System.out.println("\nMencari data 80:");
        tree.searchBST(80);
        System.out.println("\nMencari data 100:");
        tree.searchBST(100);
    }
}