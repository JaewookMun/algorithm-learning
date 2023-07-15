package study.lecture.section10_dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 가장 높은 탑 쌓기 - 탑을 쌓을 때 밑면이 좁은 벽돌 위에 밑면이 넓은 벽돌은 놓을 수 없다. (조건 4)를 고려하여
// 넓이 기준으로 내림차순 정렬하거나 (조건5) 를 고려하여 무게를 기준으로 내림차순 정렬한 후 푸는 것이 필요함.
public class Ex4_LongestTop_LIS {
    private static int[] dy;
    public static void main(String[] args) {
        Ex4_LongestTop_LIS app = new Ex4_LongestTop_LIS();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n];

        List<Bricks> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Bricks(a, h, w));
        }
        Collections.sort(list);

        System.out.println(app.solution(list));
    }

    private int solution(List<Bricks> list) {
        dy[0] = list.get(0).height;
        for(int i=1; i<list.size(); i++) {
            int max = 0;

            for(int j=i-1; j>=0; j--) {
                if(list.get(j).weight > list.get(i).weight && dy[j] > max) max = dy[j];
            }
            dy[i] = max + list.get(i).height;
        }

        int longestHeight = 0;
        for(int i=0; i<dy.length; i++) longestHeight = Math.max(longestHeight, dy[i]);

        return longestHeight;
    }

    static class Bricks implements Comparable<Bricks> {
        int area;
        int height;
        int weight;

        public Bricks(int area, int height, int weight) {
            this.area = area;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Bricks o) {
            return o.area - this.area;
        }
    }
}
