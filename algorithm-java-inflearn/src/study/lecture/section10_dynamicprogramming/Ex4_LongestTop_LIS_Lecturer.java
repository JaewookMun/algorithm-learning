package study.lecture.section10_dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 가장 높은 탑 쌓기 - 탑을 쌓을 때 밑면이 좁은 벽돌 위에 밑면이 넓은 벽돌은 놓을 수 없다. (조건 4)를 고려하여
// 넓이 기준으로 내림차순 정렬하거나 (조건5) 를 고려하여 무게를 기준으로 내림차순 정렬한 후 푸는 것이 필요함.
public class Ex4_LongestTop_LIS_Lecturer {
    static class Bricks implements Comparable<Bricks> {
        int s, h, w;

        Bricks(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Bricks o) {
            return o.s - this.s;
        }
    }

    private static int[] dy;
    private int solution(List<Bricks> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];

        for(int i=1; i<arr.size(); i++) {
            int max_h = 0;
            for(int j=i-1; j>=0; j--) {
                // i가 제일 위에 올라올 벽돌을 의미 하며 j는 i보다 밑에 있는 상황
                if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i]=max_h+arr.get(i).h;
            answer=Math.max(answer,dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex4_LongestTop_LIS_Lecturer app = new Ex4_LongestTop_LIS_Lecturer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Bricks> arr = new ArrayList<>();
        dy = new int[n];
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Bricks(a, h, w));
        }

        System.out.println(app.solution(arr));
    }
}
