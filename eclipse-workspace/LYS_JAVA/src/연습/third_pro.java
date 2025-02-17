package 연습;

import java.util.Scanner;

class Solution3 {
    public long solution(long number) {
        if (number <= 0) {
            return 0; 
        }

        long sum = 0;

        while (number > 0) {
            sum += number % 10; 
            number /= 10;       
        }

        return sum;
    }
    
}

public class third_pro {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 (-2000000000 ≤ 정수 ≤ 2000000000):");
        long number = scanner.nextLong();

        if (number < -2000000000 || number > 2000000000) {
        	System.out.println("조건에 맞지 않습니다");
        	return;
        }
        
        Solution3 solution = new Solution3();
        long result = solution.solution(number);

        System.out.println("자리 수의 합: " + result);
    }
}

		

