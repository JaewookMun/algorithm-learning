package study.lecture.section6_sortingNsearch;

import java.util.Scanner;

// LRU Algorithm - 캐시 메모리 페이지 교체 알고리즘
// Least Recently Used
public class LeastRecentlyUsed {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int count = in.nextInt();

        int[] processes = new int[count];
        for(int i=0; i<count; i++) processes[i] = in.nextInt();

        String solution = solution(size, processes);
        System.out.println(solution);
    }

    private static String solution(int size, int[] processes) {
        String answer = "";

        int[] cacheMemory = new int[size];
        int hitIdx = 0;

        for (int processId : processes) {
            boolean cacheHit = false;
            for(int i=0; i<cacheMemory.length; i++) {
                if(cacheMemory[i] == processId) {
                    cacheHit = true;
                    hitIdx = i;
                    break;
                }
            }

            if(cacheHit) for(int i=hitIdx; i>0; i--) cacheMemory[i] = cacheMemory[i-1];
            else for(int i=cacheMemory.length-1; i>0; i--) cacheMemory[i] = cacheMemory[i-1];

            cacheMemory[0] = processId;
        }

        for(int i=0; i< cacheMemory.length; i++) answer += cacheMemory[i] + " ";

        return answer;
    }
}
