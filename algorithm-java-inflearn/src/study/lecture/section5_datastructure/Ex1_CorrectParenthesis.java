package study.lecture.section5_datastructure;

import java.util.Scanner;
import java.util.Stack;

// 1. 올바른 괄호 - Stack 구조
public class Ex1_CorrectParenthesis {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Ex1_CorrectParenthesis app = new Ex1_CorrectParenthesis();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(app.solution(str));
    }
}
