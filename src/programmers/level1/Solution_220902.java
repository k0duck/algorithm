package programmers.level1;

import java.util.HashSet;

/**
 * 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
class Solution_220902 {
    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), nums.length / 2);
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums));
    }
}
