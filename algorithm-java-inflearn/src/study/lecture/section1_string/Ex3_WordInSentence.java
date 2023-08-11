package study.lecture.section1_string;

import java.util.Scanner;

// 문장속 단어
public class Ex3_WordInSentence {
    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        // split
//        String[] s = str.split(" ");
//
//        for (String x : s) {
//            int len = x.length();
//            if(len > m) {
//                m=len;
//                answer=x;
//            }
//        }

        // indexOf
        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m=len;
                answer=tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>m) answer = str; // 마지막 단어

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
