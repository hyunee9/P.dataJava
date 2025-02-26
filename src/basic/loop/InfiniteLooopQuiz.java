package basic.loop;

import java.util.Scanner;

public class InfiniteLooopQuiz {
    public static void main(String[] args) {

        /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

        int correct = 0; //while문 안에 넣어주면 안됨! 초기화되면 안되기 때문.
        int fault = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** 연산 퀴즈 ***");
        System.out.println("# 종료하시려면 0을 입력하세요.");

        while(true){

            int result = 0;
            int num1 =  (int)(Math.random() * 100 + 1);
            int num2=  (int)(Math.random() * 100 + 1);
            int operator = (int)(Math.random() * 4);

            switch (operator) {
                case 0:
                    System.out.printf("%d + %d  = ? ", num1, num2);
                    result = num1 + num2;
                    break;
                case 1:
                    System.out.printf("%d - %d  = ? ", num1, num2);
                    result = num1 - num2;
                    break;
                case 2:
                    System.out.printf("%d * %d  = ? ", num1, num2);
                    result = num1 * num2;
                    break;
                case 3:
                    System.out.printf("%d / %d  = ? ", num1, num2);
                    result = num1 / num2;
                    break;
            }
            System.out.println();
            System.out.println("정답 입력: ");
            int answer = scanner.nextInt();

            if(answer == result) {
                System.out.println("정답입니다!");
                correct++;
            } else if (answer == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("틀렸습니다!");
                fault++;
            }
        }
        System.out.println("=================");
        System.out.println("정답 횟수: " + correct);
        System.out.println("오답 횟수: " + fault);

        scanner.close();
    }
}
