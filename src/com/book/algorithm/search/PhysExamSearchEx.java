package com.book.algorithm.search;

import java.util.Comparator;

// Q7. 시력에 대한 내림차순 정렬에서 특정 시력을 가진 사람을 검색
public class PhysExamSearchEx {

    class PhyscData{
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

        private class EyesightOrderComparator implements Comparator<PhyscData>{

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return 0;
            }
        }
    }


}
