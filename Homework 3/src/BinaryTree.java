// -------------------------Binary Tree Code-------------------------

public class BinaryTree  {
    private Node root;

    public void BinaryTree(int id) {
        root = new Node(id);
    }

    public void BinaryTree() {
        root = null;
    }

    public void insert(int id) {
        Node temp = root;
        while(temp != null){
            temp = root.right;
        }
        temp = new Node(id);
    }
}


class Node {
    private int id;

    Node left;
    Node right;

    public Node(int item) {
        id = item;
        left = null;
        right = null;
    }
}

// -------------------------End Binary Tree Code-------------------------