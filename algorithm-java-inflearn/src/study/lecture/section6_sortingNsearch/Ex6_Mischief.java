package study.lecture.section6_sortingNsearch;

import java.util.Arrays;
import java.util.Scanner;

// 장난 꾸러기
// 깊은 복사***
public class Ex6_Mischief {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();

        int[] heights = new int[people];
        for(int i=0; i<people; i++) heights[i] = in.nextInt();

        String solution = solution(heights);
        System.out.println(solution);
    }

    private static String solution(int[] heights) {
        String answer = "";

        int[] temp = heights.clone();
        Arrays.sort(temp);

        int[] storage = new int[2];
        int idx = 0;
        for(int i=1; i<heights.length; i++) {
            if(heights[i] != temp[i]) storage[idx++] = i+1;
        }
        answer = storage[0] + " " + storage[1];

        return answer;
    }
}
