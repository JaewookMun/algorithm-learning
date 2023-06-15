package study.lecture.section6_sortingNsearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 좌표 정렬
public class CoordinateSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<int[]> storage = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int[] dot = new int[2];
            dot[0] = in.nextInt();
            dot[1] = in.nextInt();
            storage.add(dot);
        }

        List<String> solution = solution(storage);
        solution.forEach(System.out::println);
    }

    private static List<String> solution(List<int[]> storage) {
        List<String> answer;

        // comparing().thenComparing()을 할 때 람다식에 들어가는 배열의 타입을 강제 형변환을 통해 변경
        answer = storage.stream()
                .sorted(Comparator.comparing(arr -> ((int[]) arr)[0]).thenComparing(arr -> ((int[]) arr)[1]))
                .map(arr -> arr[0] + " " + arr[1])
                .collect(Collectors.toList());

        return answer;
    }
}
