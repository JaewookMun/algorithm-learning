package study.lecture.section1_string;

import java.util.Scanner;

// 대소문자 변환
public class Ex2_switchUpperAndLower {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) sb.append(Character.toString(str.charAt(i)).toUpperCase());
            else sb.append(Character.toString(str.charAt(i)).toLowerCase());
        }

        System.out.println(sb);
    }
}
