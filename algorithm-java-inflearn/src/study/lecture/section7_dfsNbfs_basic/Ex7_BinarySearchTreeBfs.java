package study.lecture.section7_dfsNbfs_basic;

import java.util.LinkedList;
import java.util.Queue;

class NodeB {
    int data;
    NodeB lt, rt;
    public NodeB(int val) {
        data = val;
        lt=rt=null;
    }
}

// 이진트리 순회(너비우선탐색 : 레벨 탐색)
public class Ex7_BinarySearchTreeBfs {
    NodeB root;
    public void bfs(NodeB root) {
        Queue<NodeB> Q = new LinkedList<>();
        Q.offer(root);
        // level - '몇번 만에 해당 원소에 접근하겠다'라는 의미
        // ex) root - 0 level -> 바로 접근 가능.
        int level = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(level + " : ");
            for(int i=0; i<len; i++) { // 특정 level 에 대한 원소들은 모두 취급
                NodeB cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ex7_BinarySearchTreeBfs tree = new Ex7_BinarySearchTreeBfs();
        tree.root = new NodeB(1);
        tree.root.lt = new NodeB(2);
        tree.root.rt = new NodeB(3);
        tree.root.lt.lt = new NodeB(4);
        tree.root.lt.rt = new NodeB(5);
        tree.root.rt.lt = new NodeB(6);
        tree.root.rt.rt = new NodeB(7);
        tree.bfs(tree.root);
    }
}
