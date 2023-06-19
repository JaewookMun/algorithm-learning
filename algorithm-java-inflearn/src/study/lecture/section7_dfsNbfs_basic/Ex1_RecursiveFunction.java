package study.lecture.section7_dfsNbfs_basic;

// 재귀 함수(스택프레임)
// 처음에는 if ~ else 구조 사용
public class Ex1_RecursiveFunction {

    private void dfs(int n) {
        // 종료시점을 설정하지 않으면 무한루프 - return 을 통해 종료
        if(n==0) return;
        else {
            dfs(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Ex1_RecursiveFunction t = new Ex1_RecursiveFunction();
        t.dfs(3);
    }


}
