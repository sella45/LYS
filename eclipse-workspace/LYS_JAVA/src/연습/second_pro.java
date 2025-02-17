package 연습;

import java.util.Scanner;

class Solution2 {
    public int[] solution(int[] array, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                array[i]++;
            }
        }
        return array;
    }
}

public class second_pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요 (크기는 1이상 1000이하): ");
        int length = scanner.nextInt();

        if (length < 1 || length > 1000) {
            System.out.println("배열의 크기는 1 이상 1000 이하여야 합니다.");
            return;
        }

        int[] array = new int[length];
        System.out.println("배열의 요소를 입력하세요 (요소는 0 이상 1,000,000 이하):");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0 || array[i] > 1000000) {
                System.out.println("배열의 요소는 0 이상 1,000,000 이하여야 합니다.");
                return;
            }
        }

        System.out.println("쿼리의 개수를 입력하세요 (1이상 1000이하):");
        int queryCount = scanner.nextInt();

        if (queryCount < 1 || queryCount > 1000) {
            System.out.println("쿼리의 개수는 1 이상 1000 이하여야 합니다.");
            return;
        }

        int[][] queries = new int[queryCount][2];
        System.out.println("쿼리를 입력하세요 (각 쿼리는 [s, e] 형태):");
        for (int i = 0; i < queryCount; i++) {
            queries[i][0] = scanner.nextInt(); 
            queries[i][1] = scanner.nextInt(); 

            if (queries[i][0] < 0 || queries[i][1] < 0 || queries[i][0] >= length || queries[i][1] >= length || queries[i][0] > queries[i][1]) {
                System.out.println("쿼리조건: 0 ≤ s ≤ e < 배열의 크기");
                return;
            }
        }

        Solution2 solution = new Solution2();
        int[] result = solution.solution(array, queries);

        System.out.print("쿼리를 처리한 후의 배열: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
