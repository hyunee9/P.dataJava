package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요: ");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 10:
                if(score > 100) {
                    System.out.println("잘못된 점수입니다.");
                    break;
                }
            case 9:
                System.out.println("학점은 A입니다.");
                break;
            case 8:
                System.out.println("학점은 B입니다.");
                break;
            case 7:
                System.out.println("학점은 C입니다.");
                break;
            case 6:
                System.out.println("학점은 D입니다.");
                break;
            default:
                if (score > 100 || score < 0) {
                    System.out.println("잘못된 점수입니다.");
                } else {
                    System.out.println("학점은 F입니다.");
                }







        }


    }
}
