package basic.constate;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력: ");
        int score = sc.nextInt();
        System.out.println("score = " + score);

        if (score >= 60) {
            //조건식이 참일 경우에만 실행.
            System.out.println("시험에 합격했습니다");
        } else {
            //if 조건식의 결과가 거짓인 경우 실행.
            System.out.println("시험에 불합격했습니다");
        }
        System.out.println("ㅅㄱ");

        sc.close();
    }
}
