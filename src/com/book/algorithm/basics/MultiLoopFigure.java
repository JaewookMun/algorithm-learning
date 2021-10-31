package com.book.algorithm.basics;

public class MultiLoopFigure {
    // Q15. 직각 이등변 삼각형 - 왼쪽아래 직각
    public static void triangleLB(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 왼쪽 위 직각
    public static void triangleLU(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 오른쪽 위 직각
    public static void triangleRU(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i>j){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    // 오른쪽 아래 직각
    public static void triangleRB(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j<n-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Q16. n단 피라미드 출력
    public static void spira(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<2*n-1; j++){
                if(j<n-(i+1) || j>=(n-(i+1))+2*(i+1)-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Q17. n단 피라미드 출력 - 숫자
    public static void npira(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<2*n-1; j++){
                if(j<n-(i+1) || j>=(n-(i+1))+2*(i+1)-1){
                    System.out.print(" ");
                } else {
                    System.out.print((i+1)%10);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangleLB(3);
        System.out.println();
        triangleLU(3);
        System.out.println();
        triangleRU(3);
        System.out.println();
        triangleRB(3);
        System.out.println();

        spira(4);
        spira(10);

        npira(4);
        npira(12);
    }
}
