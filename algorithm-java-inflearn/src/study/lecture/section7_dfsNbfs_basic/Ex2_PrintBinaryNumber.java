package study.lecture.section7_dfsNbfs_basic;

// 이진수 출력(재귀)
public class Ex2_PrintBinaryNumber {

    private static void dfs(int n) {
        if(n==0) return;
        else {
            dfs(n / 2);
            System.out.println(n%2 + " ");
        }
    }
    public static void main(String[] args) {
        dfs(11);
    }
}
