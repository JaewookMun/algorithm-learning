package study.lecture.section5_datastructure;

import java.util.Scanner;
import java.util.Stack;

// 2. 괄호문자 제거
public class Ex2_DeleteParenthesis {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Ex2_DeleteParenthesis app = new Ex2_DeleteParenthesis();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(app.solution(str));
    }
}
