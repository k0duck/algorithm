package programmers.level1;

import java.util.Scanner;

/**
 * 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */
class Solution_220826 {
    public static String solution(String phoneNum) {
        int len = phoneNum.length();
        String star = "";
        String num = phoneNum.substring(len - 4);

        for (int i = 0; i < len - 4; i++)
            star += "*";

        return star + num;
    }

    public static String solution2(String phoneNum) {
        char[] c = phoneNum.toCharArray();

        for (int i = 0; i < c.length - 4; i++)
            c[i] = '*';

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNum = sc.nextLine();
        System.out.println(solution(phoneNum));
        System.out.println(solution2(phoneNum));
    }
}
