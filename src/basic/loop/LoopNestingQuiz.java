package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {

           /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 하나 입력: ");
        int num = scanner.nextInt();

        int count = 0;

        for (int i = 2; i <= num ; i++) {
            int cnt = 0; //소수를 판별하기 위해 나누어 떨어진 횟수를 카운트.
            for (int j = 1; j <= i ; j++) {
                if(i % j == 0)
                    cnt++;
            }
            if (cnt == 2) {
                System.out.println("i = " + i);
                count++;
            }
        }

        System.out.println("\n소수의 개수: " + count + "개");

    }
}
