package com.book.algorithm.search;

import java.util.Optional;

public class BinSearchPrinterApp {

    // Q4. 이진검색 과정 출력 프로그램
    public static void printBinSearching(int[] array, int target){
        int medium=array.length/2;

        // first line
        System.out.printf("%2s|", "");
        for(int i=0; i<array.length; i++){
            System.out.printf("%3d", i);
        }
        System.out.println();

        // second line
        System.out.print("--+");
        for(int i=0; i<array.length; i++){
            System.out.printf("%s", "---");
        }
        System.out.println();

        for(int k=0; k<array.length/2; k++){
            // first searching
            System.out.print("  |");
            System.out.print(" <-");
            for(int j=0; j<medium-1; j++){
                System.out.print("   ");
            }
            System.out.print("  +");
            for(int j=0; j<medium-1; j++){
                System.out.print("   ");
            }
            System.out.print(" ->");
            System.out.println();

            System.out.printf("%2d|", medium);
            for(int i=0; i<array.length; i++){
                System.out.printf("%3d", array[i]);
            }
            System.out.println();

            if(array[medium] == target){
                System.out.println(target+"는 ["+medium+"]에 있습니다.");
                break;
            } else if(array[medium] < target){
                // medium=medium/2*3;
            } else {
                medium/=2;
            }
        }




    }

    public static void main(String[] args) {
        //int[] temp={1,2,3,5,6,8,9};
        int[] temp={5,7,8,9,10,11,1,2,4,3,6,15,16,17,18,19,20};

        printBinSearching(temp, 20);
    }
}
