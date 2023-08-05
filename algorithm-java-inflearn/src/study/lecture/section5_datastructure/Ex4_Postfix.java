package study.lecture.section5_datastructure;

import java.util.Scanner;
import java.util.Stack;

// 후위식 - 연산자를 뒤로 이동
public class Ex4_Postfix {
    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        // String.toCharArray() -> 개별 String이 각각 가지고 있는 char 배열을 반환
        for(char x : str.toCharArray()) {
            // char 값을 그대로 stack에 넣으면 Ascii code value가 들어간다. -> 숫자로 변경한 후 넣어준다.
            if(Character.isDigit(x)) stack.push(Character.digit(x, 10));
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') stack.push(lt + rt);
                else if(x=='-') stack.push(lt - rt);
                else if(x=='*') stack.push(lt * rt);
                else if(x=='/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Ex4_Postfix app = new Ex4_Postfix();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(app.solution(str));
    }
}
