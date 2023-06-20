package study.lecture.section7_dfsNbfs_basic;

// 팩토리얼 - factorial
public class Ex3_Factorial {

    // 재귀함수가 계속해서 값을 누적하여 연산처리
    private static int dfs(int n) {
        if(n == 1) return 1;
        else return n * dfs(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(dfs(5));
    }
}
