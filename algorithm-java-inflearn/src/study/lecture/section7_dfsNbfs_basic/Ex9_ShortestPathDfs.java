package study.lecture.section7_dfsNbfs_basic;

// Tree 말단노드까지의 가장 짧은 경로(DFS)
// -> 짧은 경로 > 간선의 갯수 (level 수준)
public class Ex9_ShortestPathDfs {
    NodeA root;
    public int dfs(int l, NodeA root) {
        if(root.lt == null && root.rt == null) return l;
        else return Math.min(dfs(l+1, root.lt), dfs(l+1, root.rt));
    }

    public static void main(String[] args) {
        Ex9_ShortestPathDfs tree = new Ex9_ShortestPathDfs();
        tree.root = new NodeA(1);
        tree.root.lt = new NodeA(2);
        tree.root.rt = new NodeA(3);
        tree.root.lt.lt = new NodeA(4);
        tree.root.lt.rt = new NodeA(5);
        System.out.println(tree.dfs(0,tree.root));
    }
}


