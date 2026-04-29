import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public static void printLeavesBFS(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); 

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll(); 

            if (current.children.isEmpty()) {
                System.out.print(current.data + " ");
            } else {
                for (TreeNode child : current.children) {
                    queue.offer(child);
                }
            }
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

        System.out.println("Hasil penelusuran leaf nodes menggunakan BFS (Level-by-Level):");
        printLeavesBFS(A);
    }
}