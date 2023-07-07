package study.lecture.section9_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 회의실 배정
public class Ex2_MeetingRoom {
    public static void main(String[] args) {
        Ex2_MeetingRoom app = new Ex2_MeetingRoom();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            list.add(new Time(s, e));
        }

        System.out.println(app.solution(list, n));
    }

    private int solution(ArrayList<Time> list, int n) {
        int cnt = 0;
        Collections.sort(list);
        int et = 0;

        for (Time ob : list) {
            if(ob.start >= et) {
                cnt++;
                et=ob.end;
            }
        }

        return cnt;
    }

    static class Time implements Comparable<Time> {

        int start, end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if(this.end == o.end) return this.start - o.start;
            else return this.end - o.end;
        }
    }

}
