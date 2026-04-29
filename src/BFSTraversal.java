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

public class BFSTraversal {
    public static void printAtDepthBFS(TreeNode root, int targetDepth) {
        if (root == null || targetDepth < 0) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); 
        int currentDepth = 0;

        while (!queue.isEmpty()) {
            if (currentDepth == targetDepth) {
                for (TreeNode node : queue) {
                    System.out.print(node.data + " ");
                }
                return; 
            }

            int nodesInCurrentLevel = queue.size();
            
            for (int i = 0; i < nodesInCurrentLevel; i++) {
                TreeNode currentNode = queue.poll(); 
                
                for (TreeNode child : currentNode.children) {
                    queue.offer(child);
                }
            }
            currentDepth++;
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

        A.addChild(B); A.addChild(C); A.addChild(D);
        B.addChild(E); B.addChild(F);
        D.addChild(G);
        F.addChild(H);

        System.out.print("Depth 1 (Target: B C D): ");
        printAtDepthBFS(A, 1);
        System.out.println();

        System.out.print("Depth 2 (Target: E F G): ");
        printAtDepthBFS(A, 2);
        System.out.println();
    }
}