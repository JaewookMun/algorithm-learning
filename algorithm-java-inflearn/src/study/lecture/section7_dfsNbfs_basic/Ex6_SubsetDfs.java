package study.lecture.section7_dfsNbfs_basic;

// 부분집합 구하기 (DFS)
public class Ex6_SubsetDfs {
    static int n;
    static int[] checked;

    public void dfs(int l) {
        if(l==n+1) {
            String temp = "";
            for(int i=1; i<checked.length; i++) {
                if(checked[i] == 1) temp += (i + " ");
            }
            if(temp.length() > 0) System.out.println(temp);

        }
        else {
            checked[l]=1;
            dfs(l+1);
            checked[l]=0;
            dfs(l+1);
        }
    }

    public static void main(String[] args) {
        Ex6_SubsetDfs T = new Ex6_SubsetDfs();
        n=3;
        checked = new int[n + 1];
        T.dfs(1);
    }
}
