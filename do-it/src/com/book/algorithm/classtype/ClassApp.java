package com.book.algorithm.classtype;

import java.util.ArrayList;
import java.util.List;

public class ClassApp {
    private double visibility;
    private int peopleNo;

    public ClassApp() {
    }

    public ClassApp(double visibility, int peopleNo) {
        this.visibility = visibility;
        this.peopleNo = peopleNo;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public int getPeopleNo() {
        return peopleNo;
    }

    public void setPeopleNo(int peopleNo) {
        this.peopleNo = peopleNo;
    }

    public void showString() {
        System.out.print(visibility+"~ : " );
        for(int i=0; i<peopleNo; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    // Q10. 시력분포 출력
    public static void main(String[] args) {
        ClassApp groupA = new ClassApp(0.1, 5);
        ClassApp groupB = new ClassApp(0.2, 7);
        ClassApp groupC = new ClassApp(0.3, 4);
        ClassApp groupD = new ClassApp(0.4, 6);
        ClassApp groupE = new ClassApp(0.5, 10);
        ClassApp groupF = new ClassApp(0.6, 12);
        ClassApp groupG = new ClassApp(0.7, 11);

        List<ClassApp> classAppList=new ArrayList<>();
        classAppList.add(groupA);
        classAppList.add(groupB);
        classAppList.add(groupC);
        classAppList.add(groupD);
        classAppList.add(groupE);
        classAppList.add(groupF);
        classAppList.add(groupG);

        for (ClassApp one : classAppList){
            one.showString();
        }
    }
}
