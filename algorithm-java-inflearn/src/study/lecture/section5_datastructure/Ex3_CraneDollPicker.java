package study.lecture.section5_datastructure;

import java.util.Scanner;
import java.util.Stack;

// 크레인 인형뽑기
public class Ex3_CraneDollPicker {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for(int i=0; i<board.length; i++) {
                if(board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp==stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex3_CraneDollPicker app = new Ex3_CraneDollPicker();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int[] moves = new int[k];
        for(int i=0; i<k; i++) moves[i] = sc.nextInt();
        System.out.println(app.solution(board, moves));
    }
}
