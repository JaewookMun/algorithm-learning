package study.lecture.section6_sortingNsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 좌표 정렬 - compareTo (지식 전수자 풀이)
class Point implements Comparable<Point> {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 음수가 반환된다는 점을 기준으로 작은 수에서 큰 수를 뺀다는 것을 생각
    /*
     * ex)
     * 임의의 Point 객체 p1, p2 -> p1.compareTo(p2)
     * 원하는 정렬 방식으로 return 값이 음수가 되도록 한다.
     *
     * 1) 오름 차순 > a2 - a1 (o - this)
     * 2) 내림 차순 > a1 - a2 (this - o)
     *
     * cf. [비고] Comparator.compare(a1, a2)
     */
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Ex7_1_CoordinateSortSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point(x, y));
        }
        // Comparable 을 구현한 객체를 넣으면 해당 객체의 compareTo 사용해서 정렬
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
}
