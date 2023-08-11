package study.lecture.section1_string;

import java.util.Scanner;

// 문자 찾기
public class Ex1_FindString {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == c) answer++;
//        }

        for(char x : str.toCharArray()) {
            if(x == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex1_FindString app = new Ex1_FindString();
        Scanner kb = new Scanner(System.in); // kb = keyboard
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(app.solution(str, c));
    }
}
