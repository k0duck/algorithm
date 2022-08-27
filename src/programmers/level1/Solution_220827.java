package programmers.level1;

/**
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
class Solution_220827 {
    public static int solution(int[] numbers) {
        int sum = 0;
        boolean[] arr = new boolean[10];

        for (int number : numbers)
            arr[number] = true;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == false) sum += i;

        return sum;
    }

    public static int solution2(int[] numbers) {
        int sum = 45; // 1~9까지의 합

        for (int number : numbers)
            sum -= number;

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution(numbers));
        System.out.println(solution2(numbers));
    }
}
