package study.lecture.section7_dfsNbfs_basic;

import java.util.*;

// 8. 송아지 찾기 1(BFS : 상태트리탐색)
// 하위 노드를 생성할 때 불필요한 노드는 생성하지 않는다. (이미 처리한 값을 사용하는 노드)
// 문제의 조건을 잘 활용
public class Ex8_CalfSearchBfs {
    private static int count = 0;
    private static int[] move = {1, -1, 5};
    private static int[] used;

    private static int bfs(int s, int e) {

        used = new int[10001];
        Queue<Integer> caseQueue = new LinkedList<>();
        used[s] = 1;
        caseQueue.offer(s);
        while(!caseQueue.isEmpty()) {
            int length = caseQueue.size();
            for(int i=0; i<length; i++) {
                int head = caseQueue.poll();
                for(int j=0; j<move.length; j++) {
                    int next = head + move[j];
                    if(next == e) return count + 1;
                    if(next >= 1 && next <= 10000 && used[next]==0) {
                        used[next] = 1;
                        caseQueue.offer(next);
                    }
                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(bfs(s, e));
    }
}
