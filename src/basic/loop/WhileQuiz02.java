package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
    public static void main(String[] args) {
        /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 1개 입력: ");
        int num = scanner.nextInt();
        int a = num, result = 0;
/*
        while(a <= 1) {
            result  = num / a;
            a--;
        }

        if (result == 1) {
            System.out.println("소수입니다.");

        }
        */


        System.out.println("==========================");

        int j = 2;

        while(num % j != 0) {
            j++;
        }
        System.out.printf("%d은(는) %s\n", num, (num == j) ? "소수입니다." : "소수가 아닙니다.");


        scanner.close();

    }
}
