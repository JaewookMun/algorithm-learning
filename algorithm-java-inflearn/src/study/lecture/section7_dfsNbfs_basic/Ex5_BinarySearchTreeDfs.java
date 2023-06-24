package study.lecture.section7_dfsNbfs_basic;

// 이진트리 순회 (깊이 우선 탐색)
// 깊이 우선 탐색 방식 - 1. 전위 순회, 2. 중위 순회, 3. 후위 순회
public class Ex5_BinarySearchTreeDfs {
    NodeA root;

    public void dfs(NodeA root) {
        if(root==null) return;
        else {
//            System.out.print(root.data + " "); // <- 전위 순회
            dfs(root.lt);
//            System.out.print(root.data + " "); // <- 중위 순회
            dfs(root.rt);
            System.out.print(root.data + " "); // <- 후위 순회
        }
    }

    public static void main(String[] args) {
        Ex5_BinarySearchTreeDfs tree = new Ex5_BinarySearchTreeDfs();
        tree.root = new NodeA(1);
        tree.root.lt = new NodeA(2);
        tree.root.rt = new NodeA(3);
        tree.root.lt.lt = new NodeA(4);
        tree.root.lt.rt = new NodeA(5);
        tree.root.rt.lt = new NodeA(6);
        tree.root.rt.rt = new NodeA(7);
        tree.dfs(tree.root);

    }
}

class NodeA {
    int data;
    NodeA lt, rt;

    public NodeA(int val) {
        data = val;
        lt=rt=null;
    }
}