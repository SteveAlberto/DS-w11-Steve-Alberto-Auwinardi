import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}

public class LeafTraversal {
    public static void printLeavesLeftToRight(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
            return; 
        }

        for (TreeNode child : node.children) {
            printLeavesLeftToRight(child);
        }
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");
        TreeNode J = new TreeNode("J");
        TreeNode K = new TreeNode("K");
        TreeNode L = new TreeNode("L");
        TreeNode M = new TreeNode("M");
        TreeNode N = new TreeNode("N");

        A.addChild(B);
        A.addChild(C);
        A.addChild(D);
        
        B.addChild(E);
        B.addChild(F);
        E.addChild(G);
        
        C.addChild(H);
        H.addChild(I);
        H.addChild(J);
        
        D.addChild(K);
        D.addChild(L);
        D.addChild(M);
        M.addChild(N);

        System.out.println("Hasil penelusuran leaf nodes dari kiri ke kanan:");
        printLeavesLeftToRight(A);
    }
}