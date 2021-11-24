package com.book.algorithm.search;

import java.util.Arrays;
import java.util.Comparator;

// Q7. 시력에 대한 내림차순 정렬에서 특정 시력을 가진 사람을 검색
public class PhysExamSearchEx {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhysExamSearchEx{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }
        // comparator based on eye
        public static final Comparator<PhyscData> EYESIGHT_ORDER = new EyesightOrderComparator();

        private static class EyesightOrderComparator implements Comparator<PhyscData>{

            @Override
            public int compare(PhyscData o1, PhyscData o2) {

                return (o1.vision > o2.vision) ? 1 : (o1.vision < o2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        PhyscData[] x = {
            new PhyscData("James", 162, 0.3),
            new PhyscData("Keven", 180, 0.5),
            new PhyscData("Robert", 175, 1.3),
            new PhyscData("Kim", 178, 0.8),
            new PhyscData("Yuna", 154, 0.9),
            new PhyscData("Gert", 183, 1.2),
        };

        int idx = Arrays.binarySearch(x, new PhyscData("", 0, 1.2), PhyscData.EYESIGHT_ORDER);
        System.out.println(idx);

    }
}
