package study.lecture.section7_dfsNbfs_basic;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단 노드까지의 가장 짧은 경로 - BFS
public class Ex10_shortestPathBfs {
    NodeB root;
    public int bfs(NodeB root) {
        Queue<NodeB> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                NodeB cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Ex10_shortestPathBfs tree = new Ex10_shortestPathBfs();
        tree.root = new NodeB(1);
        tree.root.lt = new NodeB(2);
        tree.root.rt = new NodeB(3);
        tree.root.lt.lt = new NodeB(4);
        tree.root.lt.rt = new NodeB(5);
        System.out.println(tree.bfs(tree.root));
    }
}
