package 연습;

import java.util.Scanner;

class Solution {
    
    public int solution(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}

public class first_pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 길이 (5 이상 100 이하) : ");
        int length = scanner.nextInt();

        
        if (length < 5 || length > 100) {
            System.out.println("배열의 길이는 5 이상 100 이하이어야 됩니다.");
            return;
        }

        int[] numList = new int[length];
        System.out.println("배열의 요소(요소는 -10 이상 100 이하) : ");

        for (int i = 0; i < length; i++) {
            numList[i] = scanner.nextInt();
          
            if (numList[i] < -10 || numList[i] > 100) {
                System.out.println("배열의 요소는 -10 이상 100 이하이어야 합니다.");
                return;
            }
        }

        Solution solution = new Solution();
        int result = solution.solution(numList);

        System.out.println("첫 번째 음수의 인덱스: " + result);
    }
    
}
