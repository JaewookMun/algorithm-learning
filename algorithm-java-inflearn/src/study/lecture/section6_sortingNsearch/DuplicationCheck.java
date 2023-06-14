package study.lecture.section6_sortingNsearch;

import java.util.Scanner;

// 중복 확인
// 풀이 - 정렬 후 중복되는 값 확인
public class DuplicationCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        int[] numbers = new int[people];

        for(int i=0; i<people; i++) numbers[i] = in.nextInt();

        String solution = solution(numbers);
        System.out.println(solution);
    }

    private static String solution(int[] numbers) {
        String answer = "";

        boolean duplicate = false;
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i == j) continue;

                if(numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(duplicate) break;
        }

        return answer = duplicate ? "D" : "U";
    }
}
