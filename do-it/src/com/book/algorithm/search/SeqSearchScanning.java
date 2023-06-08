package com.book.algorithm.search;

public class SeqSearchScanning {

    public static void printScanningArray(int[] array, int x){
        System.out.printf("%2s|", "");
        for(int i=0; i<array.length; i++){
            System.out.printf("%2d", i);
        }
        System.out.println();

        System.out.print("--+");
        for(int i=0; i<array.length; i++){
            System.out.printf("%s", "--");
        }
        System.out.println();


        //System.out.printf("%s|", "");
        for(int i=0; i<array.length; i++){
            System.out.print("  |");
            for(int j=0; j<i; j++){
                System.out.printf("  ");
            }
            System.out.printf("%2s", "*");

            System.out.println();
            System.out.printf("%2d|", i);
            for(int j=0; j<array.length; j++){
                System.out.printf("%2d", array[j]);
            }
            System.out.println();

            if(array[i]==x){
                System.out.println(x+"는(은) index ["+i+"]에 있습니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] test={6,4,3,2,1,9,8};
        printScanningArray(test, 3);
    }
}
