package study.lecture.section7_dfsNbfs_basic;

// 피보나치 수열 - 메모이제이션
public class Ex4_Fibonacci {

    // 메모리 활용 - 메모이제이션
    // 메모이제이션은 컴퓨터 프로그램이 동일한 계산을 반복해야 할 때,
    // 이전에 계산한 값을 메모리에 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술
    private static int[] fibo;

    // n이 1과 2가 아닌 경우, n번째 항은 n-2번째 항과 n-1번째 항을 더한 값을 받는다.
    private static int dfs(int n) {
//        if(n == 1) return 1;
//        else if(n==2) return 1;
//        else return dfs(n - 2) + dfs(n - 1);
        // 메모이제이션을 활용해 시간복잡도를 줄일 수 있음.
        if(fibo[n] > 0) return fibo[n];
        if(n == 1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        // 피보나치 수열의 나열 - 재귀 활용
        // -> 시간이 오래 걸림
        for(int i=1; i<=n; i++) System.out.println(dfs(i) + " ");

        // 0번 인덱스는 필요 없기 때문에 length 를 n+1로 설정
        fibo = new int[n+1];
        for(int i=1; i<=n; i++) System.out.println(fibo[i] + " ");
    }
}
