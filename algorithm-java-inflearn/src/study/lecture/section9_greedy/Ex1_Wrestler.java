package study.lecture.section9_greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 씨름 선수
public class Ex1_Wrestler {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Person> people = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();

            Person person = new Person(height, weight);
            people.add(person);
        }

        people.sort(Comparator.comparing(p -> ((Person) p).height).reversed());

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<people.size(); i++) {
            if(people.get(i).weight > max) {
                max = people.get(i).weight;
                count++;
            }
        }
        System.out.println(count);
    }

    static class Person {
        public int height;
        public int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }
}
