package programmers.level1;

import java.util.ArrayList;

/**
 * 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Solution_221004 {
    static ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();

        while (n != 0) {
            answer.add(n % 10);
            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }
}
