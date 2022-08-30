package programmers.level1;

/**
 * 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
class Solution_220830 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }

        return sum;
    }

    public static int solution2(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < signs.length; i++) {
            sum += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolutes, signs));
        System.out.println(solution2(absolutes, signs));
    }
}
